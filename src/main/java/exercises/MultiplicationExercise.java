package exercises;

public class MultiplicationExercise extends AbstractExercise {


    public MultiplicationExercise(ExerciseParams exerciseParams) {
    }

    @Override
    protected void initializeOperator() {
        operator = "×";
    }

    @Override
    public void calculateExpectedResult() {
        result = getFirstNumber() * getSecondNumber();
    }


    public static AbstractExercise createMultiplicationExercise(Level level) {
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
