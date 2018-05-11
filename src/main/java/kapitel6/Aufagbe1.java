package kapitel6;

import java.util.Arrays;

public class Aufagbe1 {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };

        int sum = sum(arr);
        System.out.println("Die Summe ist " + sum);

        printOddEven(arr);
    }

    static int sum(int[] values) {
        int summ = 0;

        for(int i : values) {
            summ += i;
        }

        return summ;
    }

    static void printOddEven(int[] values) {
        int odd = 0;
        int even = 0;

        for(int i : values) {
            if(i % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println(odd + " ungerade Elemente");
        System.out.println(even + " gerade Elemente");
    }

}
