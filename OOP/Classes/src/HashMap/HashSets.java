package HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class HashSets {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(5);
        numbers.add(1);
        numbers.add(5);

        //System.out.println(cars);
        for (Integer i : numbers) {
            System.out.println(i);
        }

        System.out.println(numbers.contains(1));

        // Show which numbers between 1 and 10 are in the set
        Iterator<Integer> it = numbers.iterator(); // Iterator usage
        while(it.hasNext()) {
            Integer i = it.next();
            if (numbers.contains(i)) {
                System.out.println(i + " was found in the set.");
            } else {
                System.out.println(i + " was not found in the set.");
            }
        }






    }
}
