package duck;

/**
 * Created by water on 14-12-27.
 */
public class GeneralDuck extends Duck  implements IEat, ISwim{
    public String swim() {
        return "general duck swim";
    }
    public String eat() {
        return "general duck eat";
    }
}
