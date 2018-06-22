package vorlesungsUebungen.blatt12.aufgabe1;

public class Uhr {

    private int std = 12;
    private int min;
    private int sec;

    public Uhr(int std, int min, int sec) {
        if(isUhrValid(std, min, sec))  {
            this.std = std;
            this.min = min;
            this.sec = sec;
        }

    }

    public int getStd() {
        return std;
    }

    public int getMin() {
        return min;
    }

    public int getSec() {
        return sec;
    }

    public void setUhr(int std, int min, int sec) {
        if(isUhrValid(std, min, sec)) {
            this.std = std;
            this.min = min;
            this.sec = sec;
        } else {
            System.out.println("Ungültig!");
        }
    }

    public void naechsteSek() {
        sec++;

        if(sec == 60) {
            sec = 0;
            min++;
        }

        if(min == 60) {
            min = 0;
            std++;
        }

        if(std == 24) {
            std = 0;
        }
    }

    public long getTagesSek() {
        return sec + min * 60 + std * 60 * 60;
    }

    public boolean wecker(Uhr weckzeit) {
        return getTagesSek() == weckzeit.getTagesSek();
    }

    private static boolean isUhrValid(int std, int min, int sec) {
        return std >= 0 && std < 24 && min >= 0 && min < 60 & sec >= 0 && sec < 60;
    }

}
