package kapitel5;

public class Aufgabe1 {

    public static void main(String[] args) {
        String wochentag = "Montag";

        int ergSwitch = toNumberSwitch(wochentag);
        System.out.println(wochentag + " ist der " + ergSwitch + ". Wochentag");

        int ergIf = toNumberIf(wochentag);
        System.out.println(wochentag + " ist der " + ergIf + ". Wochentag");
    }

    private static int toNumberSwitch(String wochentag) {
        switch (wochentag) {
            case "Montag": return 0;
            case "Dienstag": return 1;
            case "Mittwoch": return 2;
            case "Donnerstag": return 3;
            case "Freitag": return 4;
            case "Sammsatg": return 5;
            case "Sonntag": return 6;
            default: return -1;
        }
    }

    private static int toNumberIf(String wochentag) {
        if(wochentag.equals("Montag")) {
            return 0;
        }

        if(wochentag.equals("Dienstag")) {
            return 1;
        }

        if(wochentag.equals("Mittwoch")) {
            return 2;
        }

        if(wochentag.equals("Donnerstag")) {
            return 3;
        }

        if(wochentag.equals("Freitag")) {
            return 4;
        }

        if(wochentag.equals("Samstag")) {
            return 5;
        }

        if(wochentag.equals("Sonntag")) {
            return 6;
        }

        return -1;
    }
}
