
package billmanagerfactorydemo;

abstract public class Plan {
    double rate;
    abstract public void getRate();
    public void calculateBill(double units){
        System.out.println(units*rate);
    }
}
