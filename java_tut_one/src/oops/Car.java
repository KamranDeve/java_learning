package oops;

public class Car {
//    this is the properties of the class
    String carName;
    String brand;
    int speed;

//    this is the constructor function that will initialize the properties of the class when object is created using this Car class and its automatically run when object is created.
//    constructor name should be same as the clsss name

//    this is default constructor without parameter
   public  Car (){
        carName = "Creta";
        brand = "Suzuki";
        speed = 150;
    };

//   here now i m going to define parameterize constructor in same class when u will define more constructor then its called constructor overloading..

   public Car (String N , String B , int S){
       carName = N;
       brand = B;
       speed = S;
   }

//   this is the copy constructure
    public Car (Car c){
        carName = c.carName;
        brand = c.brand;
        speed = c.speed;
        System.out.println("copy construct is runinhg");
    }

//     now this is the methods of the car class

    public void getDetails (){
        System.out.println("Car name is " + carName);
        System.out.println("Brand name is " + brand);
        System.out.println("Max speed is " +  speed + "km/hour");
    }


}


