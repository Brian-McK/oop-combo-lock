package oop;
/**
 * Combination Lock - Combo Lock App
 * (See Exercise P8.9 from Big Java Book)
 */
public class App {
    public static void main(String[] args) {
        System.out.println("\n*** Combo Lock App ***");
        App app = new App();
        app.start();
    }

    public void start() {

        //TODO - instantiate (create) a lock object

        ComboLock lock = new ComboLock(3,5,9);

        lock.reset();

        //TODO - turn dial to enter digits

        lock.turnRight(3);
        lock.turnLeft(5);
        lock.turnRight(9);

        //TODO - test to see if lock has opened

        System.out.println("Is lock open? " + lock.open());

        System.out.println("Is lock open? " + lock.open());

        //TODO- reset lock

        lock.reset();
    }
}
