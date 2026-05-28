package by.homework.lessens.task8;

import static by.homework.lessens.task8.BoxStatic1.stat1;

public class MainStatic1 {
    public static void main(String[] args) {
        String text = "Каждая строка, создаваемая с помощью оператора new,литерала (заключенная в двойные апострофы) и ли метода класса, создающего строку, является экземпляром класса String. Особенностью объекта класса String является то, что его значение не может быть изменено после создания объекта при помощи любого метода класса. Изменение строки всегда приводит к созданию нового объекта в heap. Сама объектная ссылка при этом сохраняет прежнее значение и хранится в стеке. Произведенные изменения можно сохранить переинициализируя ссылку.";

        int k = 3;
        String substring = "/";

        String result = stat1(k, text, substring);
        System.out.println(result);
    }
}

