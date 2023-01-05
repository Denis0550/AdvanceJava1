//ABST RACT because it acts like reminder that it is an incomplete Logic
// that must not be allowed to exist as an object itself. Instead it must be inherited and
// the required business logic must be implemented by its child(sub) class

public class Abstractx {
    public static void main(String[] args) {

        //Automobile X = new Automobile(75,6);

        Truck t = new Truck(75,6);
        t.move();
        //System.out.println(t.checker);

        Van v = new Van(175,3);
        v.move();

        //Type is SuperClass(father)
        //Behavior is SubClass(child)
        Automobile a = new Truck(100,4);
        a.move();
        //a.TrucksMethod();
        //a.checker; error ???
        //System.out.println(  ((Truck) a).checker);

        //students to implement Van via polymorphism
        Automobile aa = new Van(150, 6);
        aa.move();

    }
}

abstract class Automobile {
    private int maxSpeed;
    private int gears;


    public Automobile(int maxSpeed, int gears) {
        this.maxSpeed = maxSpeed;
        this.gears = gears;
    }

    public int getMaxSpeed() { return maxSpeed; }
    public int getGears() { return gears; }

    public abstract void move();

}

class Truck extends Automobile {
    int checker=7;
    public Truck(int maxSpeed, int gears) {
        super(maxSpeed,gears);
    }

    @Override
    public void move() {
        System.out.println("TRUCK uses Diesel to move");
    }

    public void TrucksMethod(){
        System.out.println("Method() that is for TRUCK");
    }

}



class Van extends Automobile {
    public Van(int maxSpeed, int gears) {
        super(maxSpeed,gears);
    }

    @Override
    public void move() {
        System.out.println("VAN uses Petrol to move");
    }
}




//try hierarchy of override methods
abstract class GOD{
    abstract void fly();
    abstract void jump();
    abstract void play();
}

abstract class Man extends GOD{
    //public void fly(){}
    public void jump(){}
    public void play(){}

    abstract void talk();
}

class Boy extends Man{
    public void fly(){}
    //public void jump(){}
    public void talk(){}

}
