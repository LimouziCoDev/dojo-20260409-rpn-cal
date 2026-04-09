package kata.rpn.calculator;


import java.util.List;
import java.util.stream.Stream;

public class RpnParser {
    public Object parse(String rpnExpression) {
        List<Val> values = Stream.of(rpnExpression.split(" "))
                .map(RpnParser::parseVal)
                .toList();
        return new Expression(values);
    }

    private static Val parseVal(String rpnExpression) {
        return new Val(Integer.parseInt(rpnExpression));
    }
}
