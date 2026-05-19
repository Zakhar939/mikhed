package by.homework.lessens.task5;

import java.util.Scanner;

public class lessen5 {
    public static void main(String[] args) {
//        for (int i = 1; i <= 100; i++) {
//            if (i % 7 == 0 || i % 3 == 0) {
//                System.out.println(i);
//            }
//        }

//        ------------------------------

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите x");
//        int x = sc.nextInt();
//        System.out.println("Введите y");
//        int y = sc.nextInt();
//        int i = x + 1;
//        int sum = 0;
//        while (i <= y - 1) {
//            sum += i;
//            i++;
//        }
//        System.out.println("Сумма: " + sum);

//        ------------------------------

        Scanner sc = new Scanner(System.in);

        int x;
        do {
            System.out.print("Число не на 0: ");
            x = sc.nextInt();
        } while (x % 10 == 0);


        int reversed = 0;

        while (x > 0) {
            reversed = reversed * 10 + x % 10;
            x = x / 10;
        }

        System.out.println("Обратное число " + reversed);

//        ------------------------------


//        Scanner sc = new Scanner(System.in);
//
//        int x;
//        do {
//            System.out.print("Число не на 0: ");
//            x = sc.nextInt();
//        } while (x % 10 == 0);
//
//        while (x > 0) {
//            int d = x % 10;
//
//            if (d % 2 == 0)
//                System.out.println(d + " чёт");
//            else
//                System.out.println(d + " нечёт");
//
//            x /= 10;
//        }



    }


}
