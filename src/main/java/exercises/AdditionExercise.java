package exercises;

public class AdditionExercise extends AbstractExercise {

    public AdditionExercise(ExerciseParams params) {
        super(params);
    }

    @Override
    protected void initializeOperator() {
        operator = "+";
    }

    @Override
    public void calculateExpectedResult() {
        result = getFirstNumber() + getSecondNumber();
    }


}

