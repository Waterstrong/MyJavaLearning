import java.util.Dictionary;

/**
 * Created by water on 14-11-16.
 */



public abstract class Money <T extends Money>
{
    public Money(float value) {
        this.value = value;
    }
    private float value;
    private float rate;
    public float getValue() {
        return value;
    }
    public float getRate() {
        return rate;
    }
    public void setRate(float rate) {
        this.rate = rate;
    }
    public T add(Money money)
    {
        float result = this.value  + money.getValue() / money.getRate() * this.rate;
        T newMoney = null;//new T(result);
        return newMoney;
    }
}
