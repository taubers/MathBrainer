package exercises;



public class SubtractionExercise extends AbstractExercise {


    public SubtractionExercise(Level level) {
        super(level);
    }

    @Override
    protected String initializeOperator() {
        return operator = "-";
    }

    @Override
    public void calculateExpectedResult() {
        result = getFirstNumber() - getSecondNumber();
    }



    @Override
    public ExerciseParams initializeExerciseParams(Level level){
        switch (level){
            case LEVEL_1, LEVEL_2 -> {
                return new ExerciseParams(2,10, 2, 10);
            }
            case LEVEL_3 -> {
                return new ExerciseParams(50,900, 12, 849);
            }
            case LEVEL_4 -> {
                return new ExerciseParams(200,900, 200, 900);
            }
            case LEVEL_5 -> {
                return new ExerciseParams(300,900, 300, 900);
            }
            case LEVEL_6 -> {
                return new ExerciseParams(600,1800, 600, 1800);
            }
            case LEVEL_7 -> {
                return new ExerciseParams(600,1900, 600, 1800);
            }
            default -> {
                throw new IllegalStateException();
            }
        }
    }

}
