package exercises;


import java.security.SecureRandom;

public class ExerciseFactory {


    public static AbstractExercise getExercise(Level level) {
        switch (level){
            case LEVEL_1 -> {
                int exercisePicker = new SecureRandom().nextInt(2);
                switch (exercisePicker) {
                    case 0:
                        return new AdditionExercise();
                    case 1:
                        return new SubtractionExercise();
                    default:
                        throw new IllegalStateException("Unexpected value: " + exercisePicker);
                }
            }

            case LEVEL_2 -> {
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

            case LEVEL_3 -> {
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

            case LEVEL_4 -> {
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

            case LEVEL_5 -> {
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

            case LEVEL_6 -> {
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

            case LEVEL_7 -> {
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
            default -> {
                throw new IllegalStateException();}
        }
    }
}
