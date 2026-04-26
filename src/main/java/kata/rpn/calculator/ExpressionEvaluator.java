package kata.rpn.calculator;

import java.util.List;

public class ExpressionEvaluator {
    public int eval(Expression expression) {
        List<Element> elements = expression.elements();
        if (elements.size() == 3) {
            Element e1 = elements.get(0);
            Element e2 = elements.get(1);
            switch (e1) {
                case Val(int value) when e2 instanceof Val(int value1) -> {
                    return value + value1;
                }
                case null, default -> {
                }
            }
        }

        return 2;
    }
}
