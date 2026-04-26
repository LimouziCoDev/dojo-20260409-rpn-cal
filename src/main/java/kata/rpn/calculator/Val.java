package kata.rpn.calculator;

public record Val(int value) implements Element {
    @Override
    public String toString() {
        return "Val(" + value + ")";
    }
}
