package kapitel7.aufgabe2;

public class AngestellterMain {

    public static void main(String[] args) {

        Angestellter rauch = new Angestellter();
        rauch.name = "Rauch";
        rauch.alter = 30;

        Angestellter julian = new Angestellter();
        julian.name = "Julian";
        julian.alter = 21;

        julian.vorgesetzter = rauch;

        julian.vorgesetzter.alter = 40;

        System.out.println(julian.vorgesetzter);

    }

}
