
public class Main {

    static double myMethod(double x) {
        return x + Math.max(100.5, 100);
    }
    static int myMethod(int x) {
        return x + (int)(Math.max(100.5, 100));
    } // overload

    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

    static void switching(String line) {
        int day = (int) (Math.random() * 8);
        System.out.println(line);
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            default -> System.out.println("Looking forward to the Weekend");
        }
    }

    public static void main(String[] args) {

        int x;
        double y = myMethod(1);
        x = (int) y;

        String someLine = " KeyPartner - company ";
        System.out.println(someLine.concat(" in Italy"));
        System.out.println(someLine.length() + someLine.toUpperCase() + y);
        System.out.println(someLine.indexOf("company")); // "c" index

        int myAge = (int) (Math.random() * 21);
        int votingAge = (int) (Math.random() * 21);

        System.out.println("Me: " + myAge + ". Need: " + votingAge);
        if (myAge >= votingAge) {
            System.out.println("Old enough!");
        } else {
            System.out.println("Not old enough");
        }

        int time = (int) (Math.random() * 21);
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);

        for (int i = 0; i < 5; i++) {
            if (i==3) continue;
            System.out.println(i);
        }

        { // This is a block
            int i = 0;
            String strI = "";
            while (i < 5) {
                strI += i + " ";
                i++;
            }
        } // The block ends here

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String l : cars) {
            System.out.println(l);
        }

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(myNumbers[1][2]); // 7

        switching("Switch:");

        //recursion
        int resultRec = sum(10);
        System.out.println(resultRec);




    }
}