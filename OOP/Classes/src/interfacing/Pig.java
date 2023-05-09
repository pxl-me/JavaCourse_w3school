package interfacing;

class Pig implements Animal {
    public void animalSound() { // providing methods bodies
        System.out.println("The pig says: wee wee");
    }
    public void sleep() {
        System.out.println("*sleeping*");
    }
}
