public class designParkingSystem {
    public static void main(String[] args) {
        parkingSystem test = new parkingSystem(1,1,0);
        System.out.println("Initialized Parking System with " + test.bigSlots + " big, "+ test.mediumSlots + " medium, " + test.smallSlots + " small slots.");
        System.out.println("Attempting to add big car: " + test.addCar(1));
        System.out.println("Attempting to add big car: " + test.addCar(2));
        System.out.println("Attempting to add big car: " + test.addCar(3));
        System.out.println("Attempting to add big car: " + test.addCar(1));
    }
}

class parkingSystem{
    int bigSlots; // the next 3 LoC contain the slots available in the parking system.
    int mediumSlots;
    int smallSlots;

    protected parkingSystem(int big, int medium, int small){ // Constructor that should be used to initialize the system.
        this.bigSlots = big;
        this.mediumSlots = medium;
        this.smallSlots = small;
    }

    protected boolean addCar(int carType){
        switch(carType){ // depending on the car type (1 for big, 2 fo medium, 3 for small), check for slots and reduce them by 1, and return the appropriate boolean value
            case 1:
                if(bigSlots>0){
                    bigSlots--;
                    return true;
                }
                return false;
            case 2:
                if(mediumSlots>0){
                    mediumSlots--;
                    return true;
                }
                return false;
            case 3:
                if(smallSlots>0){
                    smallSlots--;
                    return true;
                }
                return false;
        }
        return false;
    }

}
