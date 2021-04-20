package exercises;


import java.security.SecureRandom;


public class ExerciseFactory {

    public static AbstractExercise getExercise(Level level) {
        switch (level){
            case LEVEL_1 -> {
                int exercisePicker = new SecureRandom().nextInt(2);
                switch (exercisePicker) {
                    case 0:
                        return new AdditionExercise(level);
                    case 1:
                        return new SubtractionExercise(level);
                    default:
                        throw new IllegalStateException("Unexpected value: " + exercisePicker);
                }
            }

            case LEVEL_2, LEVEL_3, LEVEL_4, LEVEL_5, LEVEL_6, LEVEL_7 -> {
                int exercisePicker = new SecureRandom().nextInt(4);
                switch (exercisePicker) {
                    case 0:
                        return new AdditionExercise(level);
                    case 1:
                        return new SubtractionExercise(level);
                    case 2:
                        return new DivisionExercise(level);
                    case 3:
                        return new MultiplicationExercise(level);
                    default:
                        throw new IllegalStateException("Unexpected value: " + exercisePicker);
                }
            }

            default -> {
                throw new IllegalStateException();}
        }
    }

}
