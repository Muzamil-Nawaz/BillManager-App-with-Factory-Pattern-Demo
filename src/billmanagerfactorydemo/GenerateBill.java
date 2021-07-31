package billmanagerfactorydemo;
public class GenerateBill {
    public static void main(String[] args) {
        Plan p = GetPlanFactory.getPlan("Domestic");
        p.getRate();
        p.calculateBill(3);
        p = GetPlanFactory.getPlan("Commercial");
        p.getRate();
        p.calculateBill(5);
        // TODO code application logic here
    }
    
}
