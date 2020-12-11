package development;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;


public class MathBrainerController {

    AbstractExercise exercise = ExerciseFactory.getExercise();
    String expression = exercise.getFirstNumber() + " " + exercise.getOperator() + " " + exercise.getSecondNumber() + " = " + "X";

    @FXML
    private Label showQuestionLabel;

    @FXML
    private TextField displayExerciseField;

    @FXML
    private TextField enterAnswerField;


    @FXML
    private Button checkAnswerButton;


    @FXML
    private Label displayOutputMessageField;


    @FXML
    private void checkAnswer(ActionEvent checkAnswer) {
        try {
            int answer = Integer.parseInt(enterAnswerField.getText());

            if (answer == exercise.getResult()) {
                displayOutputMessageField.setText("Malacis! Pareizi! :) \n");
                displayOutputMessageField.setTextFill(Color.web("green"));
                checkAnswerButton.setText("Nākamais uzdevums");
            } else {
                displayOutputMessageField.setText("Nav pareizi :( Mēģini vēlreiz... \n");
                displayOutputMessageField.setTextFill(Color.web("red"));

            }
        } catch (NumberFormatException e) {
            displayOutputMessageField.setText("Lūdzu ievadi tikai skaitļus\n");
            displayOutputMessageField.setStyle("-fx-text-inner-color: red");
        }
    }


    @FXML
    private void submitWithEnterKey(ActionEvent event) {
        enterAnswerField.setOnKeyPressed(event1 -> {
            if (event1.getCode() == KeyCode.ENTER) {
                checkAnswerButton.fire();
            }
        });
    }


    public void initialize() {

        displayExerciseField.setText(expression);


    }

}


