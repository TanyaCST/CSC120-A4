public class Engine {
    private double currentLevel;
    double maxLevel;
    FuelType fuelType;

    /**
     * 
     * @param fuel: the type of fuel
     * @param levelInput: the current level of fuel in engine
     */
    public Engine(FuelType fuel, double currentLevel){
        this.fuelType = fuel;
        this.currentLevel = currentLevel;

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
        this.currentLevel -= 10;

        // print some useful information (e.g. remaining fuel level) if possible
        if (currentLevel > 0) {
            return(true);
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
