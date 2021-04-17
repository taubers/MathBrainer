package exercises;

public class SubtractionExercise extends AbstractExercise {

    public SubtractionExercise(Level level){
        getSubtractionExerciseParams(level);
    }

    @Override
    protected void initializeOperator() {
        operator = "-";
    }

    @Override
    public void calculateExpectedResult() {
        result = getFirstNumber() - getSecondNumber();
    }



    public ExerciseParams getSubtractionExerciseParams(Level level) {
        switch (level){
            case LEVEL_1, LEVEL_2 -> {
                exerciseParams = new ExerciseParams(2,10, 2, 10);
                break;
            }
            case LEVEL_3 -> {
                exerciseParams = new ExerciseParams(50,900, 12, 849);
                break;
            }
            case LEVEL_4 -> {
                exerciseParams = new ExerciseParams(200,900, 200, 900);
                break;
            }
            case LEVEL_5 -> {
                exerciseParams = new ExerciseParams(300,900, 300, 900);
                break;
            }
            case LEVEL_6 -> {
                exerciseParams = new ExerciseParams(600,1800, 600, 1800);
                break;
            }
            case LEVEL_7 -> {
                exerciseParams = new ExerciseParams(600,1900, 600, 1800);
                break;
            }
            default -> {
                throw new IllegalStateException();
            }
        }
        return exerciseParams;
    }

}
