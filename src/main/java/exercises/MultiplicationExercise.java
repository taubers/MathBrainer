package exercises;

public class MultiplicationExercise extends AbstractExercise {


    public MultiplicationExercise(Level level) {
        getMultiplicationExerciseParams(level);
    }

    @Override
    protected void initializeOperator() {
        operator = "×";
    }

    @Override
    public void calculateExpectedResult() {
        result = getFirstNumber() * getSecondNumber();
    }


    public ExerciseParams getMultiplicationExerciseParams(Level level) {
        switch (level){
            case LEVEL_2 -> {
                exerciseParams = new ExerciseParams(2,10, 2, 10);
                break;
            }
            case LEVEL_3 -> {
                exerciseParams = new ExerciseParams(5,20, 12, 20);
                break;
            }
            case LEVEL_4 -> {
                exerciseParams = new ExerciseParams(5,25, 12, 20);
                break;
            }
            case LEVEL_5 -> {
                exerciseParams = new ExerciseParams(11,25, 12, 25);
                break;
            }
            case LEVEL_6 -> {
                exerciseParams = new ExerciseParams(15,30, 12, 30);
                break;
            }
            case LEVEL_7 -> {
                exerciseParams = new ExerciseParams(15,35, 12, 30);
                break;
            }
            default -> {
                throw new IllegalStateException();
            }
        }
        return exerciseParams;
    }

}
