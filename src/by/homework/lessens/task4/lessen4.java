package by.homework.lessens.task4;

import java.util.Scanner;

public class lessen4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       /* System.out.print("Введите a: ");
        int a = sc.nextInt();

        System.out.print("Введите b: ");
        int b = sc.nextInt();

        System.out.print("Введите c: ");
        int c = sc.nextInt();

        if (a % 2 == 0) System.out.println(a);
        if (b % 2 == 0) System.out.println(b);
        if (c % 2 == 0) System.out.println(c);

        System.out.print("Введите a: ");
        int a = sc.nextInt();

        System.out.print("Введите b: ");
        int b = sc.nextInt();

        System.out.print("Введите c: ");
        int c = sc.nextInt();

        if (a % 2 == 0 && a % 5 == 0) System.out.println(a);
        if (b % 2 == 0 && b % 5 == 0) System.out.println(b);
        if (c % 2 == 0 && c % 5 == 0) System.out.println(c);
    }
    */
        int x = sc.nextInt();

        int result = 15 / x;

        if (result == 3) {
            System.out.println("Результат деления равен 3");
        } else if (result == 5) {
            System.out.println("Результат деления равен 5");
        } else {
            System.out.println("Результат деления равен дробному числу");
            System.out.println((double) 15 / x);
        }
    }
}