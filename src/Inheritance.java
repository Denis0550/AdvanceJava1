public class Inheritance {

    public static void main(String[] args) {

        Vehicle myVehicle = new Vehicle(100);
        System.out.println( myVehicle.maxSpeed);
        myVehicle.startDriving();
        System.out.println( "==================1");

        Car myCar = new Car();
        System.out.println("Cars maxSpeed: " + myCar.maxSpeed);
        System.out.println(myCar.isRacecar());
        //myCar.raceCar=true; //since its private to only Car class

        System.out.println( "==================2");
        Car myBetterCar = new Car(120,true);
        System.out.println( myBetterCar.maxSpeed);
        System.out.println( myBetterCar.isRacecar());
        myBetterCar.startDriving();
        System.out.println(myBetterCar.toString());//after Variation3

        System.out.println( "==================3");

        Vehicle vehicle = new Vehicle(85);
        System.out.println(vehicle.toString());//uncomment Variation3
        System.out.println( "==================4");

        FoolishCar fcar = new FoolishCar(5);
        System.out.println(fcar.maxSpeed);
        fcar.maxSpeed = 10;
        System.out.println(fcar.maxSpeed);
        System.out.println("FoolishCars Parents maxSpeed: " + fcar.I_stillWantParentClassSpeed());
        fcar.startDriving();
    }
}

class Vehicle {
    int maxSpeed;

    public Vehicle(){
        System.out.println("Vehicle Constructor()");
    }

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        System.out.println("Vehicle Constructor(maxSpeed)");
    }

    public void startDriving() {
        System.out.println("Started Driving.... ");
    }

//Variation3
    @Override
    public String toString(){
        return "VehicleOBJ Speed: " + maxSpeed;
    }
}



class Car extends Vehicle {
    private boolean raceCar;

    public Car(){
        System.out.println("Car Constructor()");
    }

    public Car(int maxSpeed) {
        super(maxSpeed);
        if (maxSpeed > 10) {
            this.raceCar = true;
        }
    }

    public Car(int maxSpeed, boolean raceCar) {
        //super constructor always 1st statement... but maxSpeed=parameter.. can be set anywhere in this constructor
        super(maxSpeed);//knock this out... and maxSpeed wont be set
        this.raceCar = raceCar;
        System.out.println("Car Constructor(maxSpeed,raceCar)");
    }

    public boolean isRacecar() {
        return raceCar;
    }

    @Override
    public void startDriving() {
        System.out.println("Accelerate.. Varooooommm....");
    }

    @Override
    public String toString() {
        return "RaceCar with maxSpeed";
    }
}


class FoolishCar extends Vehicle {
    public int maxSpeed;

    public FoolishCar(int maxSpeed) {
        super(maxSpeed); //shadowing
        this.maxSpeed = maxSpeed;
        System.out.println("FOOLISHCar Constructor(maxSpeed)");
    }

    public int I_stillWantParentClassSpeed(){
        return super.maxSpeed;//getting the SuperClasses variable
    }

    @Override
    public void startDriving() {
        super.startDriving();//calling the SUperClass's method
        System.out.println("Started Driving Foolishly.....BANG!");
    }
}


