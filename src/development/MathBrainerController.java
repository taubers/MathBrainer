package development;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;

import java.util.EnumSet;


public class MathBrainerController {


    private enum State {SOLVING, SOLVED}

    State solutionStatus = State.SOLVING;
    int answer;

    private void statusAction() {
        switch (solutionStatus) {
            case SOLVING -> {
                try {
                    AbstractExercise exercise = ExerciseFactory.getExercise();
                    String expression = exercise.getFirstNumber() + " " + exercise.getOperator() + " " + exercise.getSecondNumber() + " = " + "X";
                    displayExerciseField.setText(expression);
                    answer = Integer.parseInt(enterAnswerField.getText());
                    if (answer != exercise.getResult()) {
                        displayOutputMessageField.setText("Nav pareizi :( Mēģini vēlreiz... \n");
                        displayOutputMessageField.setTextFill(Color.web("red"));
                    }
                } catch (NumberFormatException e) {
                    displayOutputMessageField.setText("Lūdzu ievadi tikai skaitļus\n");
                    displayOutputMessageField.setTextFill(Color.web("black"));
                }

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
        //event needed

    }

    @FXML
    private void nextExercise(ActionEvent nextExercise){
        solutionStatus = State.SOLVING;
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
        statusAction();
        nextExerciseButton.setVisible(false);


    }


}



