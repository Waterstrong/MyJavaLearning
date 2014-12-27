/**
 * Created by water on 14-11-16.
 */



public abstract class Currency // <T extends Money>
{
    public Currency(float value) {
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
    public float add(Currency currency)
    {
        float result = this.value  + currency.getValue() / currency.getRate() * this.rate;
        //T newMoney = null;//new T(result);
        return result;//newMoney;
    }
}
