package exercises;

public enum Operator {

    ADD {
        @Override
        public int e(int arg1, int arg2) {
            return arg1 + arg2;
        }
    },
    SUBTRACT {
        @Override
        public int e(int arg1, int arg2) {
            return arg1 - arg2;
        }
    },
    MULTIPLY {
        @Override
        public int e(int arg1, int arg2) {
            return arg1 * arg2;
        }
    },
    DIVIDE {
        @Override
        public int e(int arg1, int arg2) {
            return arg1 / arg2;
        }
    };

    public abstract int e(int arg1, int arg2);

    public String uiOperator() {
        switch (this) {
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

}

