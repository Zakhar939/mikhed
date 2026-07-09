package by.homework.lessens.task20;

import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

public class FileTask implements Callable<String> {
    private static final Random RANDOM = new Random();
    private static final String[] WORDS = {
            "a1", "r2", "m3", "s4", "c5",
            "g6", "w7", "s8", "p9", "f10"
    };

    private final int taskNumber;

    public FileTask(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    @Override
    public String call() throws Exception {
        String threadName = Thread.currentThread().getName();
        System.out.println("[" + threadName + "] start task " + taskNumber);

        Path dir = Paths.get("вывод");
        Files.createDirectories(dir);

        String fileName = "file_" + taskNumber + ".txt";
        Path filePath = dir.resolve(fileName);

        List<String> lines = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            lines.add(randomLine());
        }

        try (BufferedWriter writer = Files.newBufferedWriter(filePath)) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        }

        int sleepMillis = 1000 + RANDOM.nextInt(2001);
        System.out.println("[" + threadName + "] task " + taskNumber + " sleep " + sleepMillis + " ms");
        Thread.sleep(sleepMillis);

        System.out.println("[" + threadName + "] finish task " + taskNumber + " -> " + fileName);
        return fileName;
    }

    private String randomLine() {
        return WORDS[RANDOM.nextInt(WORDS.length)] + " " +
                WORDS[RANDOM.nextInt(WORDS.length)] + " " +
                (100 + RANDOM.nextInt(900));
    }
}
