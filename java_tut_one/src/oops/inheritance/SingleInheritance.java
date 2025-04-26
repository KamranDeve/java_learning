package oops.inheritance;

public class SingleInheritance {
//    A subclass inherits from a single parent class.
    public static void main(String[] args){

        Child child1 = new Child();
        child1.name = "Kamran";
        child1.place = "MZP";
        child1.details();
        child1.run();
    };


}


class Parent{
    String name;
    String place;

    public void details (){
        System.out.println("this is name " + name);
        System.out.println("this is place " + place);

    };

};

class Child extends Parent {
    public void run(){
        System.out.println("children running");
    }
};