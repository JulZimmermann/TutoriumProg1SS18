package kapitel7.aufgabe1;

public class HochschuleMain {

    public static void main(String[] args) {

        Hochschule hochschule = new Hochschule();
        hochschule.name = "FHWS";
        hochschule.anzahlStudenten = 2000;
        hochschule.adresse = "Sanderheirichsleiteweg";

        hochschule.gebeDatenAus();
        System.out.println(hochschule);

    }

}
