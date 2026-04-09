package kata.rpn.calculator;


public class RpnCalculator {
    private final RpnParser parser;
    private final ExpresssionEvaluator evaluator;
    private final ExpressionPrinter printer;

    public RpnCalculator(RpnParser parser, ExpresssionEvaluator evaluator, ExpressionPrinter printer) {
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
