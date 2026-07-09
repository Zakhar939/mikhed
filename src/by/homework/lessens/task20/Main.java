package by.homework.lessens.task20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        List<Future<String>> futures = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            futures.add(service.submit(new FileTask(i)));
        }

        Collection<String> fileNames = new ArrayList<>();

        for (Future<String> future : futures) {
            try {
                fileNames.add(future.get());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("прерван");
                break;
            } catch (ExecutionException e) {
                System.out.println("task failed: " + e.getCause());
            }
        }

        service.shutdown();

        System.out.println("Result files:");
        for (String fileName : fileNames) {
            System.out.println(fileName);
        }
    }
}
