package kata.rpn.calculator;

public record Val(int value) {
    @Override
    public String toString() {
        return "Val(" + value + ")";
    }
}
