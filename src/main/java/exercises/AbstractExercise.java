package exercises;

import java.util.Random;

public abstract class AbstractExercise {
    private ExerciseParams params;

    public Random rand = new Random();


    //protected static final int MIN = 2;
    //protected static final int MAX = 100;
    protected int firstNumber;
    protected int secondNumber;
    protected String operator;
    protected int result;


    public AbstractExercise(ExerciseParams params) {
        this.params = params;
        initializeArguments(params.getMin1(),params.getMax1(),params.getMin2(),params.getMax2());
        initializeOperator();
        calculateExpectedResult();
    }


    protected void initializeArguments(int min1, int max1, int min2, int max2) {
        firstNumber = rand.nextInt((max1 - min1) +1 ) + min1;
        secondNumber = rand.nextInt((max2 - min2) +1 ) + min2;
    }

    protected abstract void initializeOperator();

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public int getResult() {
        return result;
    }

    public String getOperator() {
        return operator;
    }

    protected abstract void calculateExpectedResult();

}


