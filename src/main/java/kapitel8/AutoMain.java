package kapitel8;

public class AutoMain {

    public static void main(String[] args) {
        System.out.println(Auto.anzahlAutos);

        Auto vw = new Auto(500, "Rot");
        System.out.println(Auto.getAnzahlAutos());

        Auto mercedes = new Auto(500, "Rot");
        System.out.println(Auto.getAnzahlAutos());

        if(mercedes.getFarbe() != null) {
            System.out.println(mercedes.getFarbe().toLowerCase());
        } else {
            System.out.println("Die Farbe ist null!");
        }
    }
}
