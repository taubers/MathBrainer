package exercises;

public class SubtractionExercise extends AbstractExercise {


    public SubtractionExercise(ExerciseParams exerciseParams) {
    }

    @Override
    protected void initializeOperator() {
        operator = "-";
    }

    @Override
    public void calculateExpectedResult() {
        result = getFirstNumber() - getSecondNumber();
    }



    public static AbstractExercise createSubtractionExercise(Level level) {
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

}
