package by.homework.lessens.task18;

public class Main {
    private static class AutoThread extends Thread {
        private final Auto auto;

        public AutoThread(Auto auto) {
            this.auto = auto;
        }

        @Override
        public void run() {
            auto.drive();
        }
    }

//    private static void runTwoCars() {
//        Auto car1 = new Auto("Машина 1", "8715 IP-3", 1000);
//        Auto car2 = new Auto("Машина 2", "1244 BB-5", 1500);
//
//        AutoThread thread1 = new AutoThread(car1);
//        AutoThread thread2 = new AutoThread(car2);
//
//        thread1.start();
//        thread2.start();
//    }
//
//    public static void main(String[] args) {
//        runTwoCars();
//    }
private static void runThreeCarsWithJoin() {
    Auto car1 = new Auto("Машина 1", "8715 IP-3", 1000);
    Auto car2 = new Auto("Машина 2", "1244 BB-5", 1500);
    Auto car3 = new Auto("Машина 3", "7788 CC-6", 700);

    AutoThread thread1 = new AutoThread(car1);
    AutoThread thread2 = new AutoThread(car2);
    AutoThread thread3 = new AutoThread(car3);

    thread1.start();

    try {
        thread1.join();
    } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
        System.out.println("остановка потока");
    }

    thread2.start();
    thread3.start();
}

    public static void main(String[] args) {
        runThreeCarsWithJoin();
    }
}

