package kata.rpn.calculator;


import java.util.List;
import java.util.stream.Stream;

public class RpnParser {
    public Expression parse(String rpnExpression) {
        List<Element> elements = Stream.of(rpnExpression.split(" "))
                .map(expression -> {
                    if ("+".equals(expression)) {
                        return parseOperator(expression);
                    } else {
                        return parseVal(expression);
                    }
                })
                .toList();
        return new Expression(elements);
    }

    private Operator parseOperator(String expression) {
        return Operator.PLUS;
    }

    private static Val parseVal(String rpnExpression) {
        return new Val(Integer.parseInt(rpnExpression));
    }
}
