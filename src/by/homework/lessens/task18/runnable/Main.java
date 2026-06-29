package by.homework.lessens.task18.runnable;

public class Main {

    private static void runTwoCarsRunnable() {
        Auto car1 = new Auto("Машина 1", "8715 IP-3", 1000);
        Auto car2 = new Auto("Машина 2", "1244 BB-5", 1500);

        Thread thread1 = new Thread(car1);
        Thread thread2 = new Thread(car2);

        thread1.start();
        thread2.start();
    }

    public static void main(String[] args) {
        runTwoCarsRunnable();
    }
}

