package exercise;
import java.util.Random;
public class Student {
    String name;
    int age;
    public Student(String studentName, int studentAge){
        this.name = studentName;
        this.age = studentAge;
    }

    public void guessingAge(){
        Random number = new Random();
        int random = number.nextInt(35);
        System.out.println("Random number " + random + " for student " + name);
        if(random == age){
            System.out.println("Random value is equal to the " + age);
        }else if(random > age){
            System.out.println("Random value is greater than " + age);
        }else if(random < age){
            System.out.println("Random value is lower than " + age);
        }
    }

}
    /*define a class called Student that has:
        2 instance variables:
        a string name
        an integer age
        a constructor method that takes as parameters studentName and studentAge, assigning the values to the 2 instance variables
        a method guessingAge that:
        generates a random integer (using java.util.Random and nextInt()) that has 35 as upperbound
        prints the random value generated for name (e.g. I generated the random number X for student Y)
        prints if the random value is equal, greater or lower to the Student's age
        define a testing class where you:
        create a Student with your name and your age
        call the guessingAge method*/
