import java.util.Scanner;

public class exer6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ENTRADA DE DADOS
        System.out.print("Digite o primeiro numero inteiro: ");
        int num1 = scanner.nextInt(); // Lê o primeiro número

        System.out.print("Digite o segundo numero inteiro: ");
        int num2 = scanner.nextInt(); // Lê o segundo número

        // PROCESSAMENTO
        int produto = num1 * num2; // Calcula o produto dos dois números

        // SAIDA
        System.out.println("O produto de " + num1 + " e " + num2 + " e: " + produto);

        scanner.close();
    }
}
