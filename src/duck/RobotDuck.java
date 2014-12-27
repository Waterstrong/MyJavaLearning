package duck;

/**
 * Created by water on 14-12-27.
 */
public class RobotDuck extends Duck implements IClimb, IFly {
    @Override
    public String climb() {
        return "robot duck climb";
    }

    @Override
    public String fly() {
        return "robot duck fly";
    }
}
