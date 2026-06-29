package by.homework.lessens.task18.runnable;

public class Auto implements Runnable {
    private String name;
    private String plate;
    private long stopMillis;

    public Auto(String name, String plate, long stopMillis) {
        this.name = name;
        this.plate = plate;
        this.stopMillis = stopMillis;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " " + plate + " едет " + i + "км");

            try {
                Thread.sleep(stopMillis);
            } catch (InterruptedException e) {
                System.out.println(name + " был прерван.");
                Thread.currentThread().interrupt();
                break;
            }
        }

        System.out.println(name + " остановилась");
    }

    public String getName() {
        return name;
    }

    public String getPlate() {
        return plate;
    }

    public long getStopMillis() {
        return stopMillis;
    }
}

