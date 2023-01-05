public class InheritanceBasics {
    public static void main(String[] args) {
    Father f = new Father();
        System.out.println("Car: " + f.car);
        System.out.println("has House: " + f.house);

        System.out.println("==============================");

    Son s = new Son();
        System.out.println("Car: " + s.car);
        System.out.println("has House: " + s.house);
        System.out.println("Bike: " + s.Bike);

        System.out.println("==============================");

    Wife w = new Wife();
        System.out.println("Car: " + w.car);
        System.out.println("has House: " + w.house);
        System.out.println("Bike: " + w.Bike);
        System.out.println("Money: " + w.money);
    }
}


 class Father{
    String car = "Chevy";
    boolean house = true;

   Father(){
        System.out.println("Father Constructed");
    }
}




class Son extends Father {//make final
    String Bike = "Yamaha";
    int money = 5;//change access

    Son() {
        System.out.println("Son Constructed");
    }
}




//son's Wife
class Wife extends Son{
    Wife() {
        System.out.println("Wife Constructed");
    }
}


