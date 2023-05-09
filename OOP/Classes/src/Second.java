public class Second {
    int x;

    public Second(int temp){ //constructors
        x = temp;
    }

    int y;
    final int z = 100; //can`t override

    static void staticHello() {
        System.out.println("Hello static world!");
    }

    public void publicHello() {
        System.out.println("Hello public world!");
    }

    public void adding(int a, int b){
        System.out.println("Sum is " + a+b);
    }
}
