package kata.rpn.calculator;


public class RpnCalculator {
    private final RpnParser parser;
    private final ExpressionEvaluator evaluator;
    private final ExpressionPrinter printer;

    public RpnCalculator(RpnParser parser, ExpressionEvaluator evaluator, ExpressionPrinter printer) {
        this.parser = parser;
        this.evaluator = evaluator;
        this.printer = printer;
    }

    public String compute(String rpnExpression) {
        var expression = parser.parse(rpnExpression);
        var result = evaluator.eval(expression);
        return printer.print(expression, result);
    }
}
