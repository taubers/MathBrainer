package exercises;

public class AdditionExercise extends AbstractExercise {


    public AdditionExercise(ExerciseParams exerciseParams) {
    }

    @Override
    protected void initializeOperator() {
        operator = "+";
    }

    @Override
    public void calculateExpectedResult() {
        result = getFirstNumber() + getSecondNumber();
    }

    public static AbstractExercise createAdditionExercise(Level level) {
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

}

