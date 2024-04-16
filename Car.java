import java.util.ArrayList;

public class Car {
    private int maxCapacity = 50;
    private ArrayList<Passenger> currentOnboard = new ArrayList<Passenger>();

    /**
     * Constructor
     * @param capacityMax: the maxiumum passenger capacity for a car
     * Set the max passenger capacity to the arraylist
     */
    public Car(int maxCapacity){
        this.currentOnboard = new ArrayList<Passenger>(maxCapacity);
        
    }

    /**
     * Return the max capacity of a car
     * @return int maxCapacity
     */
    public int getCapacity(){
        return maxCapacity;

    }

    /**
     * Return the seats remaining in a car
     * @return int seats remaining
     */
    public int seatsRemaining(){
        int seatsRemaing = maxCapacity - currentOnboard.size();
        return seatsRemaing;
        
    }

    /**
     * Add a `Passenger` from the `Car`
     * @param p: a passenger
     * @return T/F Is the operation successful?
     */
    public boolean addPassenger(Passenger p){
        currentOnboard.add(p);

        if(currentOnboard.contains(p)){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Remove a `Passenger` from the `Car` 
     * @param p: a passenger
     * @return T/F Is the operation successful?
     */
    public boolean removePassenger(Passenger p){
        currentOnboard.remove(p);

        if(currentOnboard.contains(p)){
            return false;
        }
        else{
            return true;
        }
    }

    /**
     * Print out a list of all Passengers aboard the car/"This car is EMPTY."
     */
    public void printManifest(){
        if(seatsRemaining() == maxCapacity){
            System.out.println("This car is EMPTY.");
        }
        else{
            for(int i = 0; i < currentOnboard.size(); i += 3){
                System.out.println(currentOnboard.get(i), currentOnboard.get(i+1), currentOnboard.get(i+2));
            }
        }
    }

    public static void main(String[] args) {
        Car carA = new Car(50);
    }
    

}