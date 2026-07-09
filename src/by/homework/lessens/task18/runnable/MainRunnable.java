package by.homework.lessens.task18.runnable;


public class MainRunnable {

    private static void runTwoCarsRunnable() {
        AutoRunnable car1 = new AutoRunnable("Машина 1", "8715 IP-3", 1000);
        AutoRunnable car2 = new AutoRunnable("Машина 2", "1244 BB-5", 1500);

        Thread thread1 = new Thread(car1);
        Thread thread2 = new Thread(car2);

        thread1.start();
        thread2.start();
    }

    public static void main(String[] args) {
        runTwoCarsRunnable();
    }
}
