package pruefungen.ws1415.aufgab1;

public class Liste {

    private Knoten start;
    private Knoten end;

    // Aufgabe a
    public void fuegeHinzu(Knoten knoten) {
        if(end == null) {
            start = knoten;
            end = knoten;
        } else {
            end.setNext(knoten);
            end = knoten;
        }
    }

    // Aufgabe b
    public Knoten entferneErstenKnoten() {
        if(start == null) {
            return null;
        }

        Knoten alterStart = start;

        start = start.getNext();

        if (start == null) {
            end = null;
        }

        return alterStart;
    }

    // Aufgabe a
    public boolean istLeer() {
        return start == null;
    }

}
