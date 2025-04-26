package oops;

 class Student {
//     here we are defining student clss properties ( data:data members : instance variable

     int studentId;
     String studentName;
     String studentCity;

//     here we are definig class methods or funcction that we will use in the object  ( behaviour : member methods : methods (function)

     public void study(){
         System.out.println(studentName + " is studying.");
     }

     public void studentDetails ( ){
         System.out.println("student name is " + studentName +  ", student id is " + studentId + " and student is living in this city " + studentCity);
     }

//     now here we can define here the main function to access this class but we are creating a main method in new file
}
