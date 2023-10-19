import java.util.Scanner;

public class Matriz3 {
    public static void main(String[] args) {
        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];
        int[][] resultado = new int[2][2];
        Scanner scanner = new Scanner(System.in);

        // Le a primeira matriz do usuário
        System.out.println("Digite os elementos da primeira matriz 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Digite o elemento da posição [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz1[i][j] = scanner.nextInt();
            }
        }

        // Le a segunda matriz do usuário
        System.out.println("Digite os elementos da segunda matriz 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Digite o elemento da posição [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz2[i][j] = scanner.nextInt();
            }
        }

        // Multiplica as matrizes
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        // Exibi a matriz resultante
        System.out.println("Matriz Resultante da Multiplicação:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(resultado[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}