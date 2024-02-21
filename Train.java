import java.util.ArrayList;

public class Train {
    private Engine engine;
    private ArrayList<Car> carAttached = new ArrayList<Car>();

    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
        //initialize the `Engine` and `Car`s and store them
        this.engine = new Engine(fuelType, passengerCapacity);

        for(int index = 0; index < nCars; index ++){
            Car car = new Car(passengerCapacity);
            this.carAttached.add(car);
        }

    }

    /**
     * Return engine we created
     * @return engine
    */
    public Engine getEngine(){
        return engine;
    }

    /**
     * Return the ith car attached to the train
     * @param i: the index of car attached to the train
     * @return
     */
    public Car getCar(int i){
        return carAttached.get(i);

    }


    /**
     * Return the maximum total capacity across all `Car`s
     * @return
     */
    public int getMaxCapacity(){
        int totalMaxCapa = 0;

        for(int i = 0; i < carAttached.size(); i++){
            totalMaxCapa += carAttached.get(i).getCapacity();
        }

        return totalMaxCapa;
    }

    /**
     * Return the number of remaining open seats across all `Car`s
     * @return
     */
    public int seatsRemaining(){
        int totalSeatsRemain = 0;

        for(int i = 0; i < carAttached.size(); i++){
            totalSeatsRemain += carAttached.get(i).seatsRemaining();
        }

        return totalSeatsRemain;
    }

    /**
     * Print a roster of all Passengers onboard
     */
    public void printManifest(){
        for(int i = 0; i < carAttached.size(); i++){
            this.carAttached.get(i).printManifest();
        }
        
    }
}
