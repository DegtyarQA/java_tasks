package day2;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter number: ");
        int etaz = s1.nextInt();

        if (etaz > 0) {
            if (etaz < 5) {
                System.out.println("Малоэтажный дом");
            }
            if (etaz < 9) {
                System.out.println("Среднеэтажный дом");
            }
            if (etaz > 9) {
                System.out.println("Многоэтажный дом");
            }
        } else {
            System.out.println("Incorrect input");
        }
    }
}
