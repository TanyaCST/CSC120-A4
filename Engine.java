public class Engine {
    double currentLevel;
    double maxLevel;
    FuelType fuelType;

    public Engine(FuelType fuel, double levelInput){
        fuelType = fuel;
        currentLevel = levelInput;

    }

    public void refuel(double currentLevel, double maxLevel){
        // The goal of this method is to reset the current level of fuel when it doesn't reach the max level.
        // No returns needed. 
        if(currentLevel != maxLevel){
            currentLevel = maxLevel;
        }
        
    }

    public boolean go(){
        // will decrease the current fuel level
        currentLevel -= 10;

        // print some useful information (e.g. remaining fuel level)
        // return `True` if the fuel level is above 0 and `False` otherwise
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
