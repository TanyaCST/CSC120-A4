import java.util.ArrayList;

public class Car {
    int maxCapacity = 50;
    private ArrayList<Passenger> currentOnboard = new ArrayList<Passenger>();

    public Car(int capacityMax){
        this.currentOnboard = new ArrayList<Passenger>(capacityMax);
        
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
        int seatsRemaing = seatsRemaining();
        if(seatsRemaing > 0){
            currentOnboard.add(p);
            if(currentOnboard.contains(p)){
                return true;
            }
    
            else{
                return false;
            }
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
            System.out.println(currentOnboard);
        }
    }
    

}