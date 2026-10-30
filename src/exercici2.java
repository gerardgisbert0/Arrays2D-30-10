import java.util.Scanner;

public class exercici2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueix el nombre de files (n):");
        int n = sc.nextInt();

        System.out.println("Introdueix el nombre de columnes (m):");
        int m = sc.nextInt();

        int[][] nums = new int[n][m];
        int[][] resultats = new int[3][m];

        System.out.println("Introdueix els numeros");

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.println("Numero de la fila " + i + ", columna " + j + ":");
                nums[i][j] = sc.nextInt();
            }
        }
        for (int j = 0; j < m; j++) {

            int suma = 0;
            int max = nums[0][j];
            int min = nums[0][j];

            for (int i = 0; i < n; i++) {

                suma += nums[i][j];

                if (nums[i][j] > max) {
                    max = nums[i][j];
                }

                if (nums[i][j] < min) {
                    min = nums[i][j];
                }
            }

            resultats[0][j] = suma;
            resultats[1][j] = max;
            resultats[2][j] = min;
        }
        System.out.println("========== RESULTATS ==========");

        for (int j = 0; j < m; j++) {

            System.out.println("\nCOLumna " + j);
            System.out.println("Suma: " + resultats[0][j]);
            System.out.println("Maxim: " + resultats[1][j]);
            System.out.println("Minim: " + resultats[2][j]);

            System.out.println("------------------------------");
        }

    }
}
