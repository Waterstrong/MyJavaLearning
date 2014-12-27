package duck;

/**
 * Created by water on 14-12-27.
 */
public class RubberDuck extends Duck implements ISwim{
    @Override
    public String swim() {
        return "rubber duck swim";
    }
}
