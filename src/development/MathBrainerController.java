package development;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;


public class MathBrainerController {


    private enum State {SOLVING, SOLVED}

    State solutionStatus;
    String expression;
    AbstractExercise exercise;

    private void render() {
        switch (solutionStatus) {
            case SOLVING -> {
                AbstractExercise exercise = ExerciseFactory.getExercise();
                expression = exercise.getFirstNumber() + " " + exercise.getOperator() + " " + exercise.getSecondNumber() + " = " + "X";
                displayExerciseField.setText(expression);

            }


            case SOLVED -> {
                nextExerciseButton.setVisible(true);
                enterAnswerField.setManaged(false);
                displayOutputMessageField.setText("Malacis! Pareizi! :) \n");
                displayOutputMessageField.setTextFill(Color.web("green"));

            }

        }
    }


    @FXML
    private Label showQuestionLabel;

    @FXML
    private TextField displayExerciseField;

    @FXML
    private TextField enterAnswerField;


    @FXML
    private Button checkAnswerButton;

    @FXML
    private Button nextExerciseButton;


    @FXML
    private Label displayOutputMessageField;


    @FXML
    private void checkAnswer(ActionEvent checkAnswer) {
        int answer;
        try {
            answer = Integer.parseInt(enterAnswerField.getText());
        } catch (NumberFormatException e) {
            displayOutputMessageField.setText("Lūdzu ievadi tikai skaitļus\n");
            displayOutputMessageField.setTextFill(Color.web("black"));
            return;
        }

        if (answer == exercise.getResult()) {
            solutionStatus = State.SOLVED;
            render();
        } else {
            displayOutputMessageField.setText("Nav pareizi :( Mēģini vēlreiz... \n");
            displayOutputMessageField.setTextFill(Color.web("red"));
        }


    }


    @FXML
    private void nextExercise(ActionEvent nextExercise) {
        solutionStatus = State.SOLVING;
        render();
    }


    @FXML
    private void submitWithEnterKey(ActionEvent event) {
        enterAnswerField.setOnKeyPressed(enterKeyPressed -> {
            if (enterKeyPressed.getCode() == KeyCode.ENTER) {
                checkAnswerButton.fire();
            }
        });
    }


    public void initialize() {
        solutionStatus = State.SOLVING;
        render();
        nextExerciseButton.setVisible(false);


    }


}



