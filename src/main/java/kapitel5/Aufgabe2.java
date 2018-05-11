package kapitel5;

public class Aufgabe2 {

    public static void main(String[] args) {
        printOddFor(5);
        printOddRec(5);
    }

    private static void printOddFor(int n) {
        for(int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void printOddRec(int n) {
        doPrintOddRec(1, n);
        System.out.println();
    }

    private static void doPrintOddRec(int i, int n) {
        System.out.print(i + " ");
        i += 2;

        if(i <= n) {
            doPrintOddRec(i, n);
        }
    }
}
