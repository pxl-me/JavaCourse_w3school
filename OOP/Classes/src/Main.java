import polymorph.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        Second myObj1 = new Second(10);
        System.out.println(myObj1.x);
        System.out.println();

        myObj1.y = 15;
        myObj1.y += 5;
        System.out.println(myObj1.y);
        System.out.println();

        Second myObj2 = new Second(10);
        myObj2.x = 11;
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
        System.out.println("X =" + myObj1.x + ". Y = " + myObj1.y);
        System.out.println();

        Second.staticHello();

        Second myObj3 = new Second(10);
        myObj3.publicHello();

        myObj3.adding(1,2);

        Person me = new Person();
        me.setName("Oleksandr");
        System.out.println(me.getName());
        System.out.println();

        //polymorph
        Animal myAnimal = new Animal();  // Create a Animal object
        Animal myPig = new Pig();  // Create a Pig object
        Animal myDog = new Dog();  // Create a Dog object
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
        System.out.println();

        LocalDate myObjDate = LocalDate.now(); // Create a date object
        LocalTime myObjTime = LocalTime.now();
        System.out.println(myObjDate);
        System.out.println(myObjTime);
        System.out.println();

        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }

        ArrayList<Integer> numbers = new ArrayList<Integer>(); // some lambda stuff
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        Consumer<Integer> method = (n) -> { System.out.println(n); };
        numbers.forEach( method );





    }
}