package currency;

import currency.Dollar;
import currency.RMB;
import org.junit.Test;

import static org.junit.Assert.*;

public class DollarTest {
    @Test
    public void should_get_correct_dollar_when_dollar_add_rmb() throws Exception {
        // give
        Dollar dollar = new Dollar(1);
        RMB rmb = new RMB(6);

        //when
        float res = dollar.add(rmb);

        //then
        assertEquals(res, 2.0, 0.00001);
    }
}