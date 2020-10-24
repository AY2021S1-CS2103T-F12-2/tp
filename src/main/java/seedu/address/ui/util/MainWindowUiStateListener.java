package seedu.address.ui.util;

import javafx.scene.layout.BorderPane;
import seedu.address.ui.FlashcardUi;
import seedu.address.ui.ScheduleUi;

public class MainWindowUiStateListener implements Observer<UiStateType> {

    private SingletonUiState uiState;
    private BorderPane mainWindow;
    private ScheduleUi scheduleUi;
    private FlashcardUi flashcardUi;

    /**
     * Constructor for the MainWindowUiStateListener.
     * @param mainWindow
     */
    public MainWindowUiStateListener(BorderPane mainWindow, ScheduleUi scheduleUi, FlashcardUi flashcardUi) {
        this.mainWindow = mainWindow;
        this.scheduleUi = scheduleUi;
        this.flashcardUi = flashcardUi;

        //subscribe to UiState
        uiState = SingletonUiState.getInstance();
        subscribe(uiState);

        //initialization
        handleStateChange(uiState.getUiState());
    }

    private void handleStateChange(UiStateType state) {
        switch (state) {
        case SCHEDULE:
            mainWindow.setCenter(scheduleUi.getRoot());
            break;
        case FLASHCARD:
            mainWindow.setCenter(flashcardUi.getRoot());
            break;
        default:
            throw new IllegalArgumentException();
        }
    }

    @Override
    public void subscribe(Observable news) {
        news.register(this);
    }

    @Override
    public void update(UiStateType state) {
        handleStateChange(state);
    }
}
