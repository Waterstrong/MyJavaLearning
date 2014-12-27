package duck;

/**
 * Created by water on 14-12-27.
 */
public class DonaldDuck extends Duck implements IEat {
    @Override
    public String eat() {
        return "donal duck eat";
    }
}
