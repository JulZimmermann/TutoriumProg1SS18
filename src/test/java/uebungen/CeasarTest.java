package uebungen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CeasarTest {

    Ceasar ceasar = new Ceasar();

    @Test
    void verschluessele() {

        char[] arr = {'A', 'B', 'C', 'Z'};
        char[] loesung = {'C', 'D', 'E', 'B'};

        ceasar.verschluessele(arr, 2);

        for (int i = 0; i < arr.length; i++) {
            Assertions.assertEquals(arr[i], loesung[i]);
        }
    }

}
