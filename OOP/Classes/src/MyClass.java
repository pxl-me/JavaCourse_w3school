import java.util.Scanner;
import mypack.MyPackage; // packages

public class MyClass {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");

        String userName = myObj.nextLine();
        System.out.println("Username is: " + userName);

        MyPackage P = new MyPackage();
        P.doStuff();


    }
}
