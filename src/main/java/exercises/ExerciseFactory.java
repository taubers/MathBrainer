package exercises;


import java.security.SecureRandom;

import static exercises.AdditionExercise.createAdditionExercise;
import static exercises.DivisionExercise.createDivisionExercise;
import static exercises.MultiplicationExercise.createMultiplicationExercise;
import static exercises.SubtractionExercise.createSubtractionExercise;

public class ExerciseFactory {

    public static AbstractExercise getExercise(Level level) {
        switch (level){
            case LEVEL_1 -> {
                int exercisePicker = new SecureRandom().nextInt(2);
                switch (exercisePicker) {
                    case 0:
                        return createAdditionExercise(level);
                    case 1:
                        return createSubtractionExercise(level);
                    default:
                        throw new IllegalStateException("Unexpected value: " + exercisePicker);
                }
            }

            case LEVEL_2, LEVEL_3, LEVEL_4, LEVEL_5, LEVEL_6, LEVEL_7 -> {
                int exercisePicker = new SecureRandom().nextInt(4);
                switch (exercisePicker) {
                    case 0:
                        return createAdditionExercise(level);
                    case 1:
                        return createSubtractionExercise(level);
                    case 2:
                        return createDivisionExercise(level);
                    case 3:
                        return createMultiplicationExercise(level);
                    default:
                        throw new IllegalStateException("Unexpected value: " + exercisePicker);
                }
            }

            default -> {
                throw new IllegalStateException();}
        }
    }

}
