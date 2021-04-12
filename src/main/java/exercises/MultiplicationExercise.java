package exercises;

public class MultiplicationExercise extends AbstractExercise {

    public MultiplicationExercise(ExerciseParams params) {
        super(params);
    }

    @Override
    protected void initializeOperator() {
        operator = "×";
    }

    @Override
    public void calculateExpectedResult() {
        result = getFirstNumber() * getSecondNumber();
    }


}
