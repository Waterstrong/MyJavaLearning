package currency;

import currency.Dollar;
import currency.RMB;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RMBTest {
    @Test
    public void should_get_correct_rmb_when_rmb_add_dollar() throws Exception {
        // given
        RMB rmb = new RMB(1);
        Dollar dollar = new Dollar(1);

        // when
        float res = rmb.add(dollar);

        // then
        assertEquals(res, 7.0, 0.00001);
    }
}