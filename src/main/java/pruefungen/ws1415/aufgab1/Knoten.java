package pruefungen.ws1415.aufgab1;

class Knoten {

    private String nachname;
    private Knoten next;

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public Knoten getNext() {
        return next;
    }

    public void setNext(Knoten next) {
        this.next = next;
    }
}
