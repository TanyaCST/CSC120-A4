public class Passenger {
    
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    /**
     * Call `c.addPassenger(this)` to board a given `Car`
     * @param c the car
     */
    public void boardCar(Car c){
        if(c.addPassenger(this) == true){
            c.addPassenger(this);
        }
    }

    public void getOffCar(Car c){
        if(c.removePassenger(this) == true){
            c.removePassenger(this);
        }
    }


}
