import java.util.ArrayList;


public class Car {
    int maxCapacity;

    // An `ArrayList` where it will store the `Passenger`s currently onboard
    ArrayList<Passenger> currentOnboard = new ArrayList<Passenger>();

    public Car(int capacityMax){
        currentOnboard = new ArrayList<Passenger>(capacityMax);
        
    }

    public int getCapacity(){
        return maxCapacity;

    }

    public int seatsRemaining(){
        int seatsRemaing = maxCapacity - currentOnboard.size();
        return seatsRemaing;
        
    }

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

    public boolean removePassenger(Passenger p){
        currentOnboard.remove(p);

        if(currentOnboard.contains(p)){
            return false;
        }

        else{
            return true;
        }
    }

    private void printManifest(){
        if(seatsRemaining() == maxCapacity){
            System.out.println("This car is EMPTY.");
        }
        else{
            System.out.println(currentOnboard);
        }
    }
    
    public static void main(String[] args) {
        Car myCar = new Car(50);
        System.out.println(myCar.getCapacity());
        myCar.addPassenger(null);
        myCar.removePassenger(null);
        myCar.printManifest();

    }
    

}