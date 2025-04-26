package oops.inheritance;

public class MultilevelInheritance {
//    A class inherits from another class, which itself is inherited from another class.
    public static void main (String[] args){
       C childObj = new C();
       childObj.child();
       childObj.parent();
       childObj.grand();
    }
}

class A {
    public void grand(){
        System.out.println("this is grand");
    }
}

class B extends A {
    public void parent(){
        System.out.println("this is parent");
    }
}

class C extends B {
    public void child(){
        System.out.println("this is child");
    }
};



