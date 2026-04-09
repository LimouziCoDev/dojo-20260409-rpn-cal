package kata.rpn.calculator;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

class RpnParserTest {

    @Test
    void parse_value() {
        var expression = new RpnParser().parse("2");

        Approvals.verify(expression);
    }

    @Test
    void parse_two_values() {
        var expression = new RpnParser().parse("2 0");

        Approvals.verify(expression);
    }
}
