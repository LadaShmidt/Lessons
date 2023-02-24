package Lesson13_Interface;

public class Teacher extends Employee implements Lunch.lunch{

     public void eat(){
         System.out.println("Teacher eats");
     }
     public void drink(){
         System.out.println("Teacher drinks");
     }
}
