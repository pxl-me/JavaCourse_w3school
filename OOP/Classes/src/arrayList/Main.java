package arrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>();
        //LinkedList<String> cars = new LinkedList<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        //cars.removeLast();

        System.out.println(cars);


        cars.set(0, "Opel");
        System.out.println("cars[0]: " + cars.get(0));

        Collections.sort(cars);
        for (String i : cars) {
            System.out.println(i);
        }


    }
}
