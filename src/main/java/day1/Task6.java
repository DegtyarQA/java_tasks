package day1;

public class Task6 {

    public static void main(String[] args) {
        int k = 7;
        int mnozitel = 1;
        while (mnozitel < 10) {
            int proizved = k * mnozitel;
            System.out.println(mnozitel + " " + "x" + " " + k + " " + "=" + " " + proizved);
            mnozitel++;
        }
    }
}
