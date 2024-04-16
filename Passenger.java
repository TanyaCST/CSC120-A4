public class Passenger {
    
    private String name;

    /**
     * Constructor
     * @param name: passenger's name
     */
    public Passenger(String name) {
        this.name = name;
    }

    /**
     * Call a passenger to board a given `Car`
     * @param c the given car
     */
    public void boardCar(Car c){
        if(seatsRemaining() > 0){
            c.addPassenger(this);
        }
    }

    /**
     * Call a passenger to get off from the given car
     * @param c the given car
     */
    public void getOffCar(Car c){
        if(currentOnboard.contains(this)){
            c.removePassenger(this);
        }
    }


}
