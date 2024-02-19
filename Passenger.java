public class Passenger {
    
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    public void boardCar(Car c){
        //c.addPassenger(this);
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
