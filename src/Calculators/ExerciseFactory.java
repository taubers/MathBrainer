package Calculators;

import Calculators.AdditionExercise;
import Calculators.DivisionExercise;
import Calculators.MultiplicationExercise;
import Calculators.SubtractionExercise;
import development.AbstractExercise;

import java.security.SecureRandom;

public class ExerciseFactory {
    public static AbstractExercise getExercise() {
        int exercisePicker = new SecureRandom().nextInt(4);
        switch (exercisePicker) {
            case 0:
                return new AdditionExercise();
            case 1:
                return new SubtractionExercise();
            case 2:
                return new DivisionExercise();
            case 3:
                return new MultiplicationExercise();
            default:
                throw new IllegalStateException("Unexpected value: " + exercisePicker);
        }
    }
}
