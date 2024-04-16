public class Engine {
    private double currentLevel;
    private double maxLevel;
    private FuelType fuelType;

    /**
     * Constructor
     * @param fuel: the type of fuel
     * @param levelInput: the current level of fuel in engine
     */
    public Engine(FuelType fuel, double currentLevel, double maxLevel){
        this.fuelType = fuel;
        this.currentLevel = currentLevel;
        this.maxLevel = maxLevel; 

    }

    /**
     * Accessor
     * @return current fuel level
     */
    public double getCurrentLevel(){
        return currentLevel;
    }

    /**
     * Accessor
     * @return maxium fuel level
     */
    public double getMaxLevel(){
        return maxLevel;
    }

    /**
     * Accessor
     * @return fueltype for the train
     */
    public FuelType getFuelType(){
        return fuelType;
    }

    /**
     * Reset the current level when it is lowerer than the max level
     * @param currentLevel: current level of fuel
     * @param maxLevel: the maxium level of fuel
     */
    public void refuel(double currentLevel, double maxLevel){ 
        if(currentLevel != maxLevel){
            this.currentLevel = maxLevel;
        }
        
    }

    /**
     * Decrease the current fuel level
     * @return T/F: Is the current fuel level above 0?
     */
    public boolean go(){
        if(this.currentLevel >= 10){
            this.currentLevel -= 10;
            if (currentLevel > 0) {
                return(true);
            }
            else{
                return(false);
            }
        }
        else{
            return(false);
        }

    }

    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0);
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");
    }

}
