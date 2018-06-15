package pruefungen.ws1314.aufgabe2;

public class Schachfeld {

    boolean[][] brett = new boolean[8][8];

    void setzteTurm(int x, int y) {
        for(int i = 0; i < brett.length; i++) {
            for(int j = 0; j < brett[j].length; j++) {
                if(i == x || j == y) {
                    brett[i][j] = true;
                }
            }
        }
    }

    void setzteTurm2(int x, int y) {
        for(int i = 0; i < brett.length; i++) {
            brett[x][i] = true;
        }
        for(int i = 0; i < brett.length; i++) {
            brett[i][y] = true;
        }
    }

    void gibBedrohteFelderAus() {
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                if(brett[i][j]) {
                    System.out.print("X ");
                } else {
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
    }

}
