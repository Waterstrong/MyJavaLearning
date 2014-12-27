package currency;

/**
 * Created by water on 14-11-26.
 */
public class Dollar extends Currency {
    public Dollar(float value) {
        super(value);
        this.setRate(1);
    }
}
