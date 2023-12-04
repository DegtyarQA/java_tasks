package day2;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Vvedite a: ");
        int a = input.nextInt();
        System.out.print("Vvedite b: ");
        int b = input.nextInt();

        int gradeUp=0;
        int gradeDown=0;
        if(a>b){
            gradeUp = a;
            gradeDown = b;
        } else if (b>a){
            gradeUp=b;
            gradeDown = a;
        } else if (a==b) {
            System.out.println("Incorrect input");
        }
        gradeDown+=1;

        while (gradeDown<gradeUp){
            double ostatokFive = gradeDown%5;
            double ostatokTen = gradeDown%10;
            if (ostatokFive == 0 && ostatokTen !=0){
                System.out.print(gradeDown + " ");
            }
            gradeDown++;
        }
    }

}
