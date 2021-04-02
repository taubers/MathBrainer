package exercises;


import java.security.SecureRandom;

public class ExerciseFactory {

    public static AbstractExercise getExercise(Level level) {
        switch (level){
            case LEVEL_1 -> {

            }

            case LEVEL_2 -> {

            }

            case LEVEL_3 -> {

            }

            case LEVEL_4 -> {

            }

            case LEVEL_5 -> {

            }

            case LEVEL_6 -> {

            }

            case LEVEL_7 -> {

            }
        }

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
