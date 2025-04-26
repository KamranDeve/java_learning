package oops;

public class Demo {
    public static void main(String[] args){
//        here we will create a object using class but we can defind object in other function also

        Student st1 = new Student();

//        now we are initializing properties in object that is defined in class  this student class is made without using constructor

        st1.studentId = 1;
        st1.studentName = "Kamran";
        st1.studentCity = "Mirzapur";

        st1.study();
        st1.studentDetails();


        //    now we will call the Car class that is made by using contructor

        Car myCar = new Car(); // defualt constructor automatically call

        myCar.getDetails();

        Car secondCar = new Car("City" , "Honda" , 180);  // here we are calling parametrize construtor is calling


//       secondCar.getDetails();


        //now here we are callig copy constructor

        Car thirdCar = new Car(secondCar);

        thirdCar.getDetails();
    }





}
