enum CoffeeMakerActions {
    TURN_ON("turn on", new CoffeMakerTurnOn()),
    TURN_OFF("turn off", new CoffeMakerTurnOff()),
    PUMP("pump", new ThermosiphonPump()),
    HEAT("heat", new ElectricalHeater());
    
    public String name;
    public Action action;
    
    private CoffeeMakerActions(String name, Action action){
        this.name = name;
        this.action = action;
    }
    
    public static CoffeeMakerActions findByName(String name){
        for (CoffeeMakerActions action: CoffeeMakerActions.values()){
            if (action.name.equals(name)){
                return action;
            }
        }  
        
        return CoffeeMakerActions.TURN_ON;
    }
    
    public Action getStrategy(){
        return action;
    }
}