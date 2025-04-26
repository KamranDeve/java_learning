package oops.inheritance;


public class MultipleInheritance {
//    Multiple inheritance in Java means a class can inherit from more than one parent. Java does not support multiple inheritance with classes to avoid conflicts but allows it using interfaces.
//    many parent one child
    public static void main(String[] args) {
        I obj = new I();
        obj.methodA();
        obj.methodB();
    }
};

interface G {
    void methodA();
}

interface H {
    void methodB();
}

class I implements G, H {
    public void methodA() {
        System.out.println("Method from Interface A");
    }

    public void methodB() {
        System.out.println("Method from Interface B");
    }
}


