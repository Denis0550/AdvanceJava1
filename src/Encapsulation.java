

public class Encapsulation {

        private String firstName;
        private String lastName;

        public Encapsulation(){}
        public Encapsulation(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }



        public String getFirstName() {
            return firstName;
        }
        public String getLastName() {
            return lastName;
        }

        public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
        public void setLastName(String lastName) {
        this.lastName = lastName;
    }

public static void main(String[] args) {
        Encapsulation obj = new Encapsulation("Yohan","Wadia");
        System.out.println("========");
        System.out.println(obj.firstName);
        System.out.println(obj.getFirstName());

        System.out.println("========2222");
        obj.firstName="Pavel";
        System.out.println(obj.firstName);
        System.out.println(obj.getFirstName());
    }//psvm
}//class ends...

class Ex1 extends Encapsulation {

    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation("yohan","wadia");
        System.out.println("========");
        //System.out.println(obj.firstName);
        //obj.firstName = "Pavel";
        obj.setFirstName("pavel");
        System.out.println(obj.getFirstName());
        obj.setLastName("Something");
        System.out.println(obj.getLastName());
    }
}

class Game {
    private int score;
    private int secret_score11;
    private int secret_score22;

    public Game(){}

    public int getScore() {
        return score;
    }

    public void setScore(int val) {
        this.score = val;
        secret_score11 = val*11;//you can hide datatype too
        secret_score22 = val*22;
    }

    public void showSecrets(){
        System.out.println(secret_score11 + "|" + secret_score22);
    }
}




class Ex2 {

    public static void main(String[] args) {
        Game obj = new Game();
        System.out.println("========");

        //System.out.println(obj.score);
        System.out.println(obj.getScore());

        obj.setScore(3);//100-1
        System.out.println(obj.getScore());
        obj.showSecrets();


        obj.setScore(5);//166-1
        System.out.println(obj.getScore());
        obj.showSecrets();

    }

}

