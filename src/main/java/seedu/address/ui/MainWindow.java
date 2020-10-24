package seedu.address.ui;

import java.util.logging.Logger;

import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import seedu.address.commons.core.GuiSettings;
import seedu.address.commons.core.LogsCenter;
import seedu.address.logic.Logic;
import seedu.address.ui.sidebar.SideBar;
import seedu.address.ui.util.Observable;
import seedu.address.ui.util.SingletonUiState;
import seedu.address.ui.util.UiStateListener;
import seedu.address.ui.util.UiStateType;

/**
 * The Main Window. Provides the basic application layout containing
 * a menu bar and space where other JavaFX elements can be placed.
 */
public class MainWindow extends UiPart<Stage> implements UiStateListener {

    private static final String FXML = "MainWindow.fxml";

    private final Logger logger = LogsCenter.getLogger(getClass());

    private final Stage primaryStage;
    private final Logic logic;

    private SingletonUiState uiState;

    @FXML
    private BorderPane mainWindow;



    /**
     * Creates a {@code MainWindow} with the given {@code Stage} and {@code Logic}.
     */
    public MainWindow(Stage primaryStage, Logic logic) {
        super(FXML, primaryStage);

        // Set dependencies
        this.primaryStage = primaryStage;
        this.logic = logic;


        // Configure the UI
        setWindowDefaultSize(logic.getGuiSettings());

        //subscribe to UiState
        uiState = SingletonUiState.getInstance();
        subscribe(uiState);

    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }


    /**
     * Fills up all the placeholders of this window.
     */
    void fillInnerParts() {
        mainWindow.setLeft(new SideBar(primaryStage, logic).getRoot());

        //default center view
        handleStateChange(this.uiState.getUiState());
    }

    /**
     * Sets the default size based on {@code guiSettings}.
     */
    private void setWindowDefaultSize(GuiSettings guiSettings) {
        primaryStage.setHeight(guiSettings.getWindowHeight());
        primaryStage.setWidth(guiSettings.getWindowWidth());
        if (guiSettings.getWindowCoordinates() != null) {
            primaryStage.setX(guiSettings.getWindowCoordinates().getX());
            primaryStage.setY(guiSettings.getWindowCoordinates().getY());
        }
    }

    void show() {
        primaryStage.show();
    }


    private void handleStateChange(UiStateType state) {
        switch (state) {
        case SCHEDULE:
            mainWindow.setCenter(new ScheduleUi(logic).getRoot());
            break;
        case FLASHCARD:
            mainWindow.setCenter(new FlashcardUi(logic).getRoot());
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
