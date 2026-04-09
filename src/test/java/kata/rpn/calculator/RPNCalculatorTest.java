package kata.rpn.calculator;


import org.approvaltests.Approvals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RPNCalculatorTest {

    private RpnCalculator rpnCalculator;

    @BeforeEach
    void setUp() {
        rpnCalculator = new RpnCalculator(
                new RpnParser(),
                new ExpresssionEvaluator(),
                new ExpressionPrinter());
    }

    @Test
    void compute_expression() {

        var result = rpnCalculator.compute("2 0 +");
        Approvals.verify    (result);
    }
}
