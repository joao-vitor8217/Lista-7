public class Main {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        Scanner scanner = new Scanner(System.in);

        // le os elementos da matriz a partir do teclado
        System.out.println("Digite os elementos da matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Digite o elemento da posição [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Exibe os elementos nas posições onde o índice da linha é par e o índice da coluna é ímpar
        System.out.println("Elementos nas posições onde o índice da linha é par e o índice da coluna é ímpar:");
        for (int i = 0; i < 5; i += 2) {
            for (int j = 1; j < 5; j += 2) {
                System.out.println("Elemento na posição [" + (i + 1) + "][" + (j + 1) + "]: " + matriz[i][j]);
            }
        }

        scanner.close();
    }
}