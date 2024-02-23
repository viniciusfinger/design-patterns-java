public class CoffeeMaker {
    
    public void handleAction(CoffeeMakerActions action) {
        action.getStrategy().runAction();
    }
    
}
