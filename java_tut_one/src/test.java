class test{

//    now this is the default function or method that java run time compiler runs so all method will run in this main method
    public static void main(String arr[]){

        System.out.println("Hello World!");
        //    type casting means change one data types into another data type
//    this is two type---
//   1. implicitly type casting => authomatically  by JVM
//    2. explicit type casting => forcefully by porgrammer

//  1. implicityly type casting example
        int i = 5;
        double j =i;
        System.out.println(i); //5
        System.out.println(j); //5.0
//2. explictyly type casting example


        double value =55.5;
//        int num = value;  // u cant convert double to int directly so u have to do this explictly

        int num = (int) value; // here we are explicitly converting double to int
        System.out.println( value); //55.5
        System.out.println(num); // 55


//        switch case condition example

        int marks = 65;
        String grade ;
        if(marks >= 90){
            grade = "A";
        } else if (marks > 80 && marks <90) {
            grade = "B";
        }else if(marks>60 && marks < 80){
            grade = "C";
        }else {
            grade = "Fail";
        }

        switch (grade) {
            case "A" :
                System.out.println("A Grade");
                break;

            case "B" :
                System.out.println("B Grade");
                break;

            case "C":
                System.out.println("C Grade");
                break;
            default:
                System.out.println("Fail");

        }

    }




}


