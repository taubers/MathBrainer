package exercises;

public class AdditionExercise extends AbstractExercise {

    public AdditionExercise() {
        getAdditionExerciseParams(level);
    }


    @Override
    protected void initializeOperator() {
        operator = "+";
    }

    @Override
    public void calculateExpectedResult() {
        result = getFirstNumber() + getSecondNumber();
    }

    public void getAdditionExerciseParams(Level level) {
        switch (level) {
            case LEVEL_1, LEVEL_2 -> {
                exerciseParams = new ExerciseParams(2, 10, 2, 10);
                break;
            }
            case LEVEL_3 -> {
                exerciseParams = new ExerciseParams(20, 900, 20, 900);
                break;
            }
            case LEVEL_4 -> {
                exerciseParams = new ExerciseParams(15, 900, 15, 900);
                break;
            }
            case LEVEL_5 -> {
                exerciseParams = new ExerciseParams(120, 900, 120, 900);
                break;
            }
            case LEVEL_6 -> {
                exerciseParams = new ExerciseParams(300, 1200, 300, 1200);
                break;
            }
            case LEVEL_7 -> {
                exerciseParams = new ExerciseParams(300, 1500, 300, 1200);
                break;
            }
            default -> {
                throw new IllegalStateException();
            }
        }

        //return exerciseParams;


    }
}

