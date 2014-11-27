/**
 * Created by water on 14-11-16.
 */
public class MoneyConverter {
    public static void main(String [] args) {
        Dollar dollar = new Dollar(6);
        RMB rmb = new RMB(6);
        //float value = dollar.add(rmb).getValue();
        float value = rmb.add(dollar).getValue();
        System.out.println(value);
    }
}
