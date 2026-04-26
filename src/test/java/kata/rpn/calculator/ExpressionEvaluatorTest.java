package kata.rpn.calculator;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class ExpressionEvaluatorTest {

    private ExpressionEvaluator expressionEvaluator;

    @BeforeEach
    void setUp() {
        expressionEvaluator = new ExpressionEvaluator();
    }

    @Test
    void evaluation_val_expression() {

        final var expression = new Expression(List.of(new Val(2)));

        int result = expressionEvaluator.eval(expression);

        Approvals.verify(result);
    }

    @Test
    void evaluation_two_values_followed_by_plus_expression() {

        final var expression = new Expression(List.of(
                new Val(2),
                new Val(3),
                Operator.PLUS
        ));

        int result = expressionEvaluator.eval(expression);

        Approvals.verify(result);
    }
}