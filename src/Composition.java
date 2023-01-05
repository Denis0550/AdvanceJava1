// When an Object is composed of other objects...
// These composing objects are specific to the creation of the OWNING object
// And when the OWNING object is destroyed the composing objects have no real life of their own

public class Composition {
    public static void main(String[] args) {
        Phone obj = new Phone("iOS", 9, 1100, 50.0);
        obj.getMyStatus();

        System.out.println("#######################################");

//check hierarchy
//        obj.bat.power = 100;
//        obj.getMyStatus();
//check life/scope
//        obj = null;
//        System.out.println(obj.os.name);


    }
}

class OS{
    String name;
    public OS(String name){
        this.name=name;
    }

    public String getStatus(){
        if(name.equals("Android")){return "Cool OS";}
        else if(name.equals("iOS")){return "hmmm... tore!";}
        else{return "paha!";}// missing return statement
    }
}

class Version {
    int version;

    public Version(int version) {
        this.version = version;
    }

    public String getStatus() {
        if (version > 10) {
            return "Great!";
        } else if (version < 10) {
            return "Please Update...";
        } else {
            return "Special Case!";
        }
    }
}

class Battery{
    int power;

    public Battery(int power){
        this.power = power;
    }

    public String getStatus() {
        if (power > 1000) {
            return "Powerful!";
        } else {
            return "Weak ... ";
        }
    }
}

//make a Camera class

class Camera {
    double mpx;

    public Camera(double mpx) {
        this.mpx = mpx;
    }

    public String getStatus() {
        if (mpx > 30.0) {
            return "Sharp Snaps!";
        } else {
            return "Blurry pics ...";
        }
    }

}



    class Phone {
        Version v;
        OS os;
        Battery bat;
        Camera cam;


        public Phone(String os, int v, int p, double mp ) {
            this.os= new OS(os);
            this.v = new Version(v);
            this.bat = new Battery(p);
            this.cam = new Camera(mp);

        }

        public void getMyStatus(){
            System.out.println(os.getStatus());
            System.out.println(v.getStatus());
            System.out.println(bat.getStatus());
            System.out.println(cam.getStatus());
        }
    }
