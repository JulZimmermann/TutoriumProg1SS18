package kapitel7.aufgabe1;

public class Hochschule {

    String name;
    int anzahlStudenten;
    String adresse;

    void gebeDatenAus() {
        System.out.println("Name: " + name + " Anzahl Studenten: " + anzahlStudenten + " Adresse: " + adresse);
    }

    public String toString() {
        return  "Name: " + name + " Anzahl Studenten: " + anzahlStudenten + " Adresse: " + adresse;
    }

}
