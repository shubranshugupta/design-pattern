import facade.ECommerceFacade;

public class MainClass {
    public static void main(String[] args) throws Exception {
        ECommerceFacade eCommerceFacade = new ECommerceFacade("data.csv");
        eCommerceFacade.buyProduct(1, 2, "123 Main St", "1234567890");
    }
}
