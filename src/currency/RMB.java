package currency;

/**
 * Created by water on 14-11-16.
 */
public class RMB extends Currency {
    public RMB(float value)
    {
        super(value);
        this.setRate(6);
    }
}
