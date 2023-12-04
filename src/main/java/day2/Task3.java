package day2;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Vvedite a: ");
        int a = input.nextInt();
        System.out.print("Vvedite b: ");
        int b = input.nextInt();

        int gradeUp = 0;
        int gradeDown = 0;
        if (a > b) {
            gradeUp = a;
            gradeDown = b;
        } else if (b > a) {
            gradeUp = b;
            gradeDown = a;
        } else if (a == b) {
            System.out.println("Incorrect input");
        }
        for (int i = gradeDown + 1; i < gradeUp; i++) {
            double ostatokFive = i % 5;
            double ostatokTen = i % 10;
            if (ostatokFive == 0 && ostatokTen != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
