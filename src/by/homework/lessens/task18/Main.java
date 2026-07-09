package by.homework.lessens.task18;

public class Main {

    private static void runTwoCars() {
        Auto car1 = new Auto("Машина 1", "8715 IP-3", 1000);
        Auto car2 = new Auto("Машина 2", "1244 BB-5", 1500);

        car1.start();
        car2.start();
    }

    private static void runThreeCarsWithJoin() {
        Auto car1 = new Auto("Машина 1", "8715 IP-3", 1000);
        Auto car2 = new Auto("Машина 2", "1244 BB-5", 1500);
        Auto car3 = new Auto("Машина 3", "7788 CC-6", 700);

        car1.start();

        try {
            car1.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("main был прерван при ожидании car1");
        }

        car2.start();
        car3.start();
    }

    public static void main(String[] args) {
        runTwoCars();
        // runThreeCarsWithJoin();
    }
}
