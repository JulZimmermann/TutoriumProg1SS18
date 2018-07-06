package prog2Einstieg.aufgabe3;

public class Bestellung {

    private int bestellNr;
    private Artikel[]  artikel  = new Artikel[50];

    public Artikel[] getArtikel() {
        return artikel;
    }

    public void setArtikel(Artikel[] artikel) {
        this.artikel = artikel;
    }

    public void einfuegen(Artikel artikel) {
        for (int i = 0; i < this.artikel.length; i++) {
            if(this.artikel[i] == null) {
                this.artikel[i] = artikel;
                break;
            }
        }
    }

    public void loescheArtkel(Artikel artikel){
    }



}
