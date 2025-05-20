import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        // Criação do objeto Scanner para entrada de dados
        Scanner entrada = new Scanner(System.in);

        // Declaração das variáveis
        int num1, num2, resultado;

        // Entrada de dados
        System.out.println("Digite o primeiro número:");
        num1 = entrada.nextInt();

        System.out.println("Digite o segundo número:");
        num2 = entrada.nextInt();

        // Processamento (neste exemplo, vamos somar os dois números)
        resultado = num1 + num2;

        // Saída do resultado
        System.out.println("O resultado da soma é: " + resultado);

        // Fechar o Scanner para evitar vazamentos de recursos
        entrada.close();
    }
}


