import java.util.Scanner;

public class exercici3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] matriu = new char[5][5];

        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {

                if (i == 0 || i == 4 || i == j) {
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
