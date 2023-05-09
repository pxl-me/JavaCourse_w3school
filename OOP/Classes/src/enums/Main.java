package enums;

import java.util.Random;

public class Main {
    enum Level {
        NONE,
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args)
    {
        Random random = new Random();

        for (Level loopVar : Level.values()) {
        System.out.println(loopVar);
        }
        System.out.println();

        int n = random.nextInt(4 - 1) + 1;
        Level myVar = Level.NONE;

        switch (n) {
            case 1 ->  myVar = Level.LOW;
            case 2 ->  myVar = Level.MEDIUM;
            case 3 ->  myVar = Level.HIGH;
        }

        switch(myVar) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }
    }
}
