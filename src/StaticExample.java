public class StaticExample {
    public static void main(String[] args) {
        Girl obj  = new Girl();
        obj.name = "Mona Lisa";

        Girl.name = "Mona Lisa";


    }
}


class Girl {
    static String name;
}