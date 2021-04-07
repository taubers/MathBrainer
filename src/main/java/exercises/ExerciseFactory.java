package exercises;


import java.security.SecureRandom;

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

            case LEVEL_2 -> {
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

            case LEVEL_3 -> {
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

            case LEVEL_4 -> {
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

            case LEVEL_5 -> {
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

            case LEVEL_6 -> {
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

            case LEVEL_7 -> {
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

    private static AbstractExercise createAdditionExercise(Level level) {
        //TODO create ExerciseParams according to level
        return new AdditionExercise(new ExerciseParams(1,10));
    }

    private static AbstractExercise createSubtractionExercise(Level level) {
        //TODO create ExerciseParams according to level
        return new SubtractionExercise(new ExerciseParams(1,10));
    }

    private static AbstractExercise createDivisionExercise(Level level) {
        //TODO create ExerciseParams according to level
        return new DivisionExercise(new ExerciseParams(1,10));
    }

    private static AbstractExercise createMultiplicationExercise(Level level) {
        //TODO create ExerciseParams according to level
        return new MultiplicationExercise(new ExerciseParams(1,10));
    }


}
