package uebungen;

public class Ceasar {

    void verschluessele(char[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] -= 'A';
            arr[i] += n;
            arr[i] %= 26;
            arr[i] += 'A';
        }
    }

}
