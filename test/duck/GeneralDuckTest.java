package duck;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class GeneralDuckTest {
    @Test
    public void should_get_duck_swim_when_general_duck_here() throws Exception {
        Duck duck = new GeneralDuck();

        //assertThat(duck.quack(), is("gaga"));
        assertThat( ((GeneralDuck)duck).swim(), is("general duck swim"));
    }
}