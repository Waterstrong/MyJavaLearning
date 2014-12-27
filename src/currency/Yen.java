package currency;

/**
 * Created by water on 14-12-27.
 */
public class Yen extends Currency {
    public Yen(float value) {
        super(value);
        this.setRate(60);
    }
}
