package exercises;

public enum Operator {
    ADD,
    SUBTRACT,
    MULTIPLY,
    DIVIDE;

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

