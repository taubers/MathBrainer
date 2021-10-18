package exercises;

import unused.ExerciseParams;

import java.util.Random;

public abstract class AbstractExercise {
    protected Random rand = new Random();

    protected int firstNumber;
    protected int secondNumber;
    protected Operator operator;
    protected int result;


    public AbstractExercise(Level level) {
        ExerciseParams exerciseParams = initializeExerciseParams(level);
        initializeArguments(exerciseParams);
        initializeOperator();
        calculateExpectedResult();
    }


    protected void initializeArguments(ExerciseParams params) {
        firstNumber = rand.nextInt((params.getMax1() - params.getMin1()) + 1) + params.getMin1();
        secondNumber = rand.nextInt((params.getMax2() - params.getMin2()) + 1) + params.getMin2();
    }

    protected abstract void initializeOperator();

    protected abstract ExerciseParams initializeExerciseParams(Level level);


    protected void calculateExpectedResult() {
        result = getOperator().e(getFirstNumber(),getSecondNumber());
    }

    protected int getFirstNumber() {
        return firstNumber;
    }

    protected int getSecondNumber() {
        return secondNumber;
    }

    public int getResult() {
        return result;
    }

    public Operator getOperator() {
        return operator;
    }

    // Returns a String of the expression to UI with modified operation
    public String getExpression() {
        return getFirstNumber() + " " + getOperator().uiOperator() + " " + getSecondNumber();
    }


    }




