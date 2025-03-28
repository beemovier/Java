import java.util.Scanner;

public class exer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos 4 números
        System.out.print("Digite o primeiro numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo numero: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite o terceiro numero: ");
        int num3 = scanner.nextInt();

        System.out.print("Digite o quarto numero: ");
        int num4 = scanner.nextInt();

        // Calculando a soma
        int soma = num1 + num2 + num3 + num4;

        // Exibindo o resultado
        System.out.println("\nResultado: " + soma);

        scanner.close();
    }
}
