import java.util.Scanner;

public class exer2 {
    public static void main(String[] args) {

        // Entrada
        int num1;
        int num2;
        int num3;
        int num4;
        int soma;

        // Processamento

        Scanner escreva = new Scanner(System.in);

        // Leitura dos 4 números
        System.out.print("Digite o primeiro numero: ");
        num1 = escreva.nextInt();

        System.out.print("Digite o segundo numero: ");
        num2 = escreva.nextInt();

        System.out.print("Digite o terceiro numero: ");
        num3 = escreva.nextInt();

        System.out.print("Digite o quarto numero: ");
        num4 = escreva.nextInt();

        // Calculando a soma
        soma = num1 + num2 + num3 + num4;

        // Saida
        System.out.println("\nResultado: " + soma);

        escreva.close();
    }
}
