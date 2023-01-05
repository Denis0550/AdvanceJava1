public class InheritanceAdvanced {
    public static void main(String[] args) {

        Parent p = new Parent();
        System.out.println(p instanceof Parent);
        System.out.println(p instanceof Child1);
        System.out.println(p instanceof Child2);
        System.out.println("===========================");

        Child1 child1 = new Child1();
        Parent parentChild2 = new Child2();
        System.out.println(child1 instanceof Parent);
        System.out.println(child1 instanceof Child1);
        System.out.println(parentChild2 instanceof Child2);
        System.out.println(parentChild2 instanceof Parent);
        System.out.println(parentChild2 instanceof Child1);
        System.out.println("===========================");

        System.out.println(child1.getClass());
        System.out.println(parentChild2.getClass());

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        interF obj = new MrA();
        System.out.println(obj.getClass());
        System.out.println(obj instanceof interF);
        System.out.println(obj instanceof MrA);
        System.out.println("-------------------------");
        interF obj2 = new interF() {
            @Override
            public void xyz() {

            }
        };
        System.out.println(obj2.getClass());
        System.out.println(obj2 instanceof interF);


    }
}



class Parent{}
class Child1 extends Parent{}
class Child2 extends Parent{}



interface interF{
    void xyz();
}
class MrA implements interF {

    @Override
    public void xyz() { }
}

class MrB implements interF {

    @Override
    public void xyz() {
    }
}