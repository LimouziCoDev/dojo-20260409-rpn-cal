package kata.rpn.calculator;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RpnParserTest {

    private RpnParser rpnParser;

    @BeforeEach
    void setUp() {
        rpnParser = new RpnParser();
    }

    @Test
    void parse_value() {
        var expression = rpnParser.parse("2");

        Approvals.verify(expression);
    }

    @Test
    void parse_two_values() {
        var expression = rpnParser.parse("2 0");

        Approvals.verify(expression);
    }

    @Test
    void parse_two_values_followed_by_plus() {
        var expression = rpnParser.parse("2 0 +");

        Approvals.verify(expression);
    }
}
