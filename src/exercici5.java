import java.util.Scanner;

public class exercici5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] notes = new double[20][6];
        for (int i = 0; i < notes.length; i++) {

            System.out.println("Alumne " + (i + 1));

            for (int j = 0; j < 3; j++) {
                System.out.println("Introdueix la nota:");
                notes[i][j] = sc.nextDouble();
            }
        }
        double millorNota = notes[0][0];
        double pitjorNota = notes[0][0];

        for (int i = 0; i < notes.length; i++) {

            double suma = 0;
            double max = notes[i][0];
            double min = notes[i][0];

            for (int j = 0; j < 3; j++) {

                suma = suma + notes[i][j];

                if (notes[i][j] > max) {
                    max = notes[i][j];
                }

                if (notes[i][j] < min) {
                    min = notes[i][j];
                }
            }

            notes[i][3] = suma / 3;
            notes[i][4] = max;
            notes[i][5] = min;

            if (max > millorNota) {
                millorNota = max;
            }

            if (min < pitjorNota) {
                pitjorNota = min;
            }
        }

        System.out.println("NOTES DELS ALUMNES");

        for (int i = 0; i < notes.length; i++) {

            for (int j = 0; j < notes[i].length; j++) {
                System.out.print(notes[i][j] + " | ");
            }

            System.out.println();
        }
        System.out.println("Millor nota del curs: " + millorNota);
        System.out.println("Pitjor nota del curs: " + pitjorNota);
    }
}
