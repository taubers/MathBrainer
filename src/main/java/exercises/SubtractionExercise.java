package exercises;

public class SubtractionExercise extends AbstractExercise {

    public SubtractionExercise(ExerciseParams params) {
        super(params);
    }

    @Override
    protected void initializeOperator() {
        operator = "-";
    }

    @Override
    public void calculateExpectedResult() {
        result = getFirstNumber() - getSecondNumber();
    }


}
