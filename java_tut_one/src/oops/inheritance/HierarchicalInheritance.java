package oops.inheritance;

public class HierarchicalInheritance {
//    Multiple classes inherit from a single parent class.
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Buddy";
        dog.eat();
        dog.bark();

        Cat cat = new Cat();
        cat.name = "Whiskers";
        cat.eat();
        cat.meow();
    }
}

class Animal {
    String name;

    public void eat() {
        System.out.println("This animal " + name + " is eating...");
    }
}

class Dog extends Animal {
    public void bark() { // Fixed method declaration
        System.out.println(name + " is barking...");
    }
}

class Cat extends Animal {
    public void meow() {
        System.out.println(name + " is meowing...");
    }
}
