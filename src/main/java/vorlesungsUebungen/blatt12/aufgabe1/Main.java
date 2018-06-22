package vorlesungsUebungen.blatt12.aufgabe1;

public class Main {

    public static void main(String[] args) {

        Uhr[] weltzeit = new Uhr[24];

        for (int i = 0; i < 24; i++) {
            weltzeit[i]= new Uhr(i, 23, 7);
        }

        for (Uhr uhr : weltzeit) {
            uhr.naechsteSek();
        }
        
    }

}
