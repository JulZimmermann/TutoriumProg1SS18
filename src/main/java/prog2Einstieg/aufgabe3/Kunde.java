package prog2Einstieg.aufgabe3;

public class Kunde {

    private  Bestellung[] bestellungen = new Bestellung[50];

    public Bestellung getBestellungByArtikelName(String artikelName) {
        for(Bestellung bestellung : bestellungen) {
            for (Artikel artikel : bestellung.getArtikel()) {
                if(artikel.artikelNamme.equals(artikelName)) {
                    return bestellung;
                }
            }
        }

        return null;
    }

}
