package by.homework.lessens.task17;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Main {

    private static final String TEXT =
            "The Rostóvs knew everybody in Moscow. The old count had money enough that year, as all his estates had been remortgaged, and so Nicholas, acquiring a trotter of his own, very stylish riding breeches of the latest cut, such as no one else yet had in Moscow, and boots of the latest fashion, with extremely pointed toes and small silver spurs, passed his time very gaily. After a short period of adapting himself to the old conditions of life, Nicholas found it very pleasant to be at home again. He felt that he had grown up and matured very much. His despair at failing in a Scripture examination, his borrowing money from Gavríl to pay a sleigh driver, his kissing Sónya on the sly—he now recalled all this as childishness he had left immeasurably behind. Now he was a lieutenant of hussars, in a jacket laced with silver, and wearing the Cross of St. George, awarded to soldiers for bravery in action, and in the company of well-known, elderly, and respected racing men was training a trotter of his own for a race. He knew a lady on one of the boulevards whom he visited of an evening. He led the mazurka at the Arkhárovs’ ball, talked about the war with Field Marshal Kámenski, visited the English Club, and was on intimate terms with a colonel of forty to whom Denísov had introduced him.";

    public static void task1_1() throws IOException {
        Path path = Path.of("data", "text1.txt");
        Files.createDirectories(path.getParent());
        Files.writeString(path, TEXT, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    }

    public static void task1_2() throws IOException {
        Path path = Path.of("/Users/zaharmihed/Desktop/java учёба/17 задание/text2.txt");
        Files.createDirectories(path.getParent());
        Files.writeString(path, TEXT, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    }

    public static void task1_3() throws IOException {
        Path path = Path.of("data", "text1.txt");
        String text = Files.readString(path);
        System.out.println("1 тесктовый файл");
        System.out.println(text);
    }

    public static void task1_4() throws IOException {
        Path path = Path.of("/Users/zaharmihed/Desktop/java учёба/17 задание/text2.txt");
        String text = Files.readString(path);
        System.out.println("2 текстовый файл");
        System.out.println(text);
    }

    public static void main(String[] args) {
        try {
            task1_1();
            task1_2();
            task1_3();
            task1_4();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
