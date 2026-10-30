import java.util.Scanner;

public class exercici1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digam el valor de n");
        int n = sc.nextInt();
        System.out.println("Digam el valor de m");
        int m = sc.nextInt();

        int[][] nums = new int[n][m];
        int[] suma = new int[m];

        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums[i].length; j++){
                System.out.println("Introdueix el nombre");
                nums[i][j] = sc.nextInt();
            }
        }
        for (int j = 0; j < m; j++){
            for (int i = 0; i < n; i++){
                suma[j] += nums[i][j];
            }
        }
        for (int i = 0; i < suma.length;i++){
            System.out.println("Suma de la columna " + i + " es " + suma[i]);
        }
    }
}


