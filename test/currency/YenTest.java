package currency;

import currency.Dollar;
import currency.RMB;
import currency.Yen;
import org.junit.Test;

import static org.junit.Assert.*;

public class YenTest {
    @Test
    public void should_get_correct_yen_when_yen_add_rmb() throws Exception {
        Yen yen = new Yen(1);
        RMB rmb = new RMB(1);

        float res = yen.add(rmb);

        assertEquals(res, 11, 0.00001);
    }

    @Test
    public void should_get_correct_yen_when_yen_add_dollar() throws Exception {
        Yen yen = new Yen(1);
        Dollar dollar = new Dollar(1);

        float res = yen.add(dollar);

        assertEquals(res, 60, 0.00001);
    }

    @Test
    public void should_get_correct_yen_when_yen_add_yen() throws Exception {
        Yen yen1 = new Yen(1);
        Yen yen2 = new Yen(2);

        float res = yen1.add(yen2);

        assertEquals(res, 3.0, 0.00001);
    }
}