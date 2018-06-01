package kapitel8;

public class Auto {

    private int ps;
    private String farbe;

    public static int anzahlAutos;

    public Auto(int ps, String farbe) {
        setPs(ps);
        setFarbe(farbe);
        anzahlAutos++;
    }

    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        if(ps > 0) {
            this.ps = ps;
        }
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        if(farbe.equals("Schwarz") || farbe.equals("Weiß")) {
            this.farbe = farbe;
        }
    }

    public static int getAnzahlAutos() {
        return anzahlAutos;
    }

    public void fahren() {
        System.out.println("ich fahre");
    }

}
