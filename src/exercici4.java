import java.util.Scanner;

public class exercici4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] matriu = new char[5][5];

        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {

                if (i == j || i + j == 4) {
                    matriu[i][j] = 'X';
                } else {
                    matriu[i][j] = ' ';
                }
                System.out.print(matriu[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
