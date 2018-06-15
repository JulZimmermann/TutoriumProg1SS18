package pruefungen.ws1314;

public class Aufgabe1 {

    boolean isZweistellig(int zahl){
        if(zahl >= 10 && zahl <= 99 || zahl <= -10 && zahl >= -99) {
            return true;
        }

        return false;
    }

}
