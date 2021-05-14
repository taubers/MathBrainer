package exercises;

import java.util.Random;

public abstract class AbstractExercise {
    protected Random rand = new Random();

    protected int firstNumber;
    protected int secondNumber;
    protected int thirdNumber; //temporary entry
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
        thirdNumber = rand.nextInt((20 - 2) + 1) + 2; //temporary entry
    }

    protected abstract void initializeOperator();

    protected abstract ExerciseParams initializeExerciseParams(Level level);

    protected void calculateExpectedResult() {
        result = e(getFirstNumber(), getOperator(), getSecondNumber());
    }

    ;

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public int getResult() {
        return result;
    }

    public Operator getOperator() {
        return operator;
    }

    public String getExpression() {
        return getFirstNumber() + " " + transformOperator(getOperator()) + " " + getSecondNumber();
    }

    public String transformOperator(Operator operator) {
        switch (operator) {
            case DIVIDE -> {
                return "÷";
            }
            case MULTIPLY -> {
                return "×";
            }
            case ADD -> {
                return "+";
            }
            case SUBTRACT -> {
                return "-";
            }
            default -> {
                throw new IllegalStateException();
            }
        }
    }

    public static int e(int arg1, Operator operator, int arg2) {

        switch (operator) {
            case DIVIDE -> {
                return arg1 / arg2;
            }
            case MULTIPLY -> {
                return arg1 * arg2;
            }
            case ADD -> {
                return arg1 + arg2;
            }
            case SUBTRACT -> {
                return arg1 - arg2;
            }
            default -> {
                throw new IllegalStateException();
            }

        }
    }


}


