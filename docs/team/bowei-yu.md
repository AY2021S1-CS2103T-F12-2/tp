---
layout: page
title: Yu Bowei's Project Portfolio Page
---

### Overview
As part of CS2103T: Software Engineering, my team of 4 software engineering students and I were tasked with enhancing an existing project, [Address Book Level 3 (AB3)](https://github.com/nus-cs2103-AY1920S1/addressbook-level3), into a new product for our Software Engineering project. We chose to morph it into a study management application for students, called **StudyBananas**.

**StudyBananas** is a desktop study companion app that helps students centralize all their study tasks and set up focused study sessions into one place, optimized for use via a Command Line Interface** (CLI) while still having the benefits of a Graphical User Interface (GUI).

### Summary of Contributions

This section shows a summary of my contributions to the project.

**Code contributed**: Please refer to this [page](https://nus-cs2103-ay2021s1.github.io/tp-dashboard/#breakdown=true&search=bowei-yu&sort=groupTitle&sortWithin=title&since=2020-08-14&timeframe=commit&mergegroup=&groupSelect=groupByRepos&checkedFileTypes=docs~functional-code~test-code~other&until=2020-11-09) to see a sample of my code.

**Major enhancement**: 'Quiz' feature

* What it does: The 'Quiz' feature comes with a set of commands that allows users to start, stop, or go through with the quiz scheduled, with a specified flashcard set. 
It stores the user's answers and whether each question is answered correctly for them to refer to it later.
To prevent the user from accidentally creating two quizzes, this feature checks if there are any ongoing quizzes whenever a user starts a quiz.
Additionally, commands to modify parts of the other features, schedule and flashcards, are not allowed during a quiz run,
due to the interloped connection between scheduled quizzes as well as flashcard sets. At the end of a quiz, 
students can view their last quiz attempt scores.
  
* Justification: One goal of StudyBananas is to provide an all-in-one application for students so that they
 can schedule their study session and recap their concepts without needing a separate application. 
 This integration with both the schedule and the flashcards allows users to quickly track their sessions
 and begin their revision.

* Highlights: This enhancement required an understanding of the flashcards feature. 
I am responsible for the back-end logic, storage, unit testing and part of the front-end of this feature.

**Major enhancement**: Parts of 'Flashcards' feature testing - I am responsible for the unit testing of commands, storage and model for the flashcards.

**Minor enhancement**: I modified the Graphical User Interface (GUI) for the 'Quiz' feature for displaying quiz records.
 
**Contributions to documentation**:
 - User guide:
     - Wrote the section for `Commands for the QUIZ` page: [#273](https://github.com/AY2021S1-CS2103T-F12-2/tp/pull/273)
     - Help to standardize formatting between group members: [#286](https://github.com/AY2021S1-CS2103T-F12-2/tp/pull/286)
 - Developer guide: 
     - Wrote the sections for the implementation of the 'Quiz' feature in the developer guide: [#130](https://github.com/AY2021S1-CS2103T-F12-2/tp/pull/130)
     - Added use cases, non-functional requirements to the developer guide: [#63](https://github.com/AY2021S1-CS2103T-F12-2/tp/pull/63)
     - Added product survey and test cases to developer guide: [#315](https://github.com/AY2021S1-CS2103T-F12-2/tp/pull/315)
 
**Contributions to team-based tasks**:
- Maintaining the issue tracker
- Release management
