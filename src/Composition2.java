

//In this example of "Composition2.java"
//the bullets object is not created inside Gun class.
//in "Composition.java" the constructors for new objects were called inside
// the Constructor of the composing class.
//But here... Bullets has an object, that exists by itself. it was not
// created inside the memory space of GUN, so it is unlike the Composition.java example
// It is free and the variable "b" in GUN is only linked(referenced) to object bulletsOBJ.
//So any change in bulletsOBJ will also be reflected in GUN.b
//ALSO if GUN object is destroyed... Guns variable "b"(ie is a link) will die..
// BUT Bullet's object bulletsOBJ will continue to live on in
// the program... and that is why this kind of association is called AGGREGATION


import java.util.ArrayList;
import java.util.List;

public class Composition2 {
    public static void main(String[] args) {
        Bullets bulletOBJ = new Bullets();
        bulletOBJ.number = 8;
        Gun gunObj= new Gun("MachineGun", bulletOBJ);

        System.out.println(gunObj.type +"|"+ gunObj.b.number);
        bulletOBJ.number = 2;
        System.out.println(gunObj.type +"|"+ gunObj.b.number);
        System.out.println("-------------------------");

        gunObj.b.number = 5;
        System.out.println(bulletOBJ.number);
        gunObj=null;
        System.out.println(bulletOBJ.number);
        //System.out.println(gunObj.b.number);//error

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxx");

        //proof between NEW creation...
        // and...
        // referencing an Object via assignment
        List<String> letters = new ArrayList<>();
        letters.add("AA");
        letters.add("BB");
        letters.add("CC");
        letters.add("DD");
        letters.add("EE");
        letters.add("FF");
        System.out.println(letters);
        //List<String> copy =  letters;
        List<String> copy = new ArrayList<>(letters);
        copy.remove(0);
        copy.remove(1);
        System.out.println(letters);
    }
}

class Gun{
    String type;//handgun or AK47 or Kalashnikov etc etc...
    Bullets b;

    public Gun(String type, Bullets b) {
        this.type = type;
        this.b = b;
    }

}

class Bullets{
    int number;
}


