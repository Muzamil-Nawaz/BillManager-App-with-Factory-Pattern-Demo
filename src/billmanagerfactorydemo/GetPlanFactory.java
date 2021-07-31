package billmanagerfactorydemo;
public class GetPlanFactory {
    public static Plan getPlan(String type){
        if(type=="Domestic")
            return new DomesticPlan();
        else if(type=="Commercial")
            return new CommercialPlan();
        else
            return null;
        
    }
}
