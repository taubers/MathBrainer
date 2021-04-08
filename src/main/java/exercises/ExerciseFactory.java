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
        switch (level){
            case LEVEL_1, LEVEL_2 -> {
                ExerciseParams exerciseParams = new ExerciseParams(2,10, 2, 10);
                return new AdditionExercise(exerciseParams);
            }
            case LEVEL_3 -> {
                ExerciseParams exerciseParams = new ExerciseParams(20,900, 20, 900);
                return new AdditionExercise(exerciseParams);
            }
            case LEVEL_4 -> {
                ExerciseParams exerciseParams = new ExerciseParams(15,900, 15, 900);
                return new AdditionExercise(exerciseParams);
            }
            case LEVEL_5 -> {
                ExerciseParams exerciseParams = new ExerciseParams(120,900, 120, 900);
                return new AdditionExercise(exerciseParams);
            }
            case LEVEL_6 -> {
                ExerciseParams exerciseParams = new ExerciseParams(300,1200, 300, 1200);
                return new AdditionExercise(exerciseParams);
            }
            case LEVEL_7 -> {
                ExerciseParams exerciseParams = new ExerciseParams(300,1500, 300, 1200);
                return new AdditionExercise(exerciseParams);
            }
            default -> {
                throw new IllegalStateException();
            }
        }

    }

    private static AbstractExercise createSubtractionExercise(Level level) {
        switch (level){
            case LEVEL_1, LEVEL_2 -> {
                ExerciseParams exerciseParams = new ExerciseParams(2,10, 2, 10);
                return new SubtractionExercise(exerciseParams);
            }
            case LEVEL_3 -> {
                ExerciseParams exerciseParams = new ExerciseParams(50,900, 12, 849);
                return new SubtractionExercise(exerciseParams);
            }
            case LEVEL_4 -> {
                ExerciseParams exerciseParams = new ExerciseParams(200,900, 200, 900);
                return new SubtractionExercise(exerciseParams);
            }
            case LEVEL_5 -> {
                ExerciseParams exerciseParams = new ExerciseParams(300,900, 300, 900);
                return new SubtractionExercise(exerciseParams);
            }
            case LEVEL_6 -> {
                ExerciseParams exerciseParams = new ExerciseParams(600,1800, 600, 1800);
                return new SubtractionExercise(exerciseParams);
            }
            case LEVEL_7 -> {
                ExerciseParams exerciseParams = new ExerciseParams(600,1900, 600, 1800);
                return new SubtractionExercise(exerciseParams);
            }
            default -> {
                throw new IllegalStateException();
            }
        }
    }

    private static AbstractExercise createDivisionExercise(Level level) {
        switch (level){
            case LEVEL_2 -> {
                ExerciseParams exerciseParams = new ExerciseParams(2,10, 2, 10);
                return new DivisionExercise(exerciseParams);
            }
            case LEVEL_3 -> {
                ExerciseParams exerciseParams = new ExerciseParams(80,200, 2, 15);
                return new DivisionExercise(exerciseParams);
            }
            case LEVEL_4 -> {
                ExerciseParams exerciseParams = new ExerciseParams(80,200, 2, 20);
                return new DivisionExercise(exerciseParams);
            }
            case LEVEL_5 -> {
                ExerciseParams exerciseParams = new ExerciseParams(150,300, 2, 25);
                return new DivisionExercise(exerciseParams);
            }
            case LEVEL_6 -> {
                ExerciseParams exerciseParams = new ExerciseParams(190,900, 4, 32);
                return new DivisionExercise(exerciseParams);
            }
            case LEVEL_7 -> {
                ExerciseParams exerciseParams = new ExerciseParams(190,900, 4, 35);
                return new DivisionExercise(exerciseParams);
            }
            default -> {
                throw new IllegalStateException();
            }
        }

    }

    private static AbstractExercise createMultiplicationExercise(Level level) {
        switch (level){
            case LEVEL_2 -> {
                ExerciseParams exerciseParams = new ExerciseParams(2,10, 2, 10);
                return new MultiplicationExercise(exerciseParams);
            }
            case LEVEL_3 -> {
                ExerciseParams exerciseParams = new ExerciseParams(5,20, 12, 20);
                return new MultiplicationExercise(exerciseParams);
            }
            case LEVEL_4 -> {
                ExerciseParams exerciseParams = new ExerciseParams(5,25, 12, 20);
                return new MultiplicationExercise(exerciseParams);
            }
            case LEVEL_5 -> {
                ExerciseParams exerciseParams = new ExerciseParams(11,25, 12, 25);
                return new MultiplicationExercise(exerciseParams);
            }
            case LEVEL_6 -> {
                ExerciseParams exerciseParams = new ExerciseParams(15,30, 12, 30);
                return new MultiplicationExercise(exerciseParams);
            }
            case LEVEL_7 -> {
                ExerciseParams exerciseParams = new ExerciseParams(15,35, 12, 30);
                return new MultiplicationExercise(exerciseParams);
            }
            default -> {
                throw new IllegalStateException();
            }
        }
    }


}
