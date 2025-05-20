import java.util.Scanner;

public class exer5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ENTRADA DE DADOS
        float base;
        float altura;
        float area;

        // PROCESSAMENTO
        System.out.print("Digite o valor da base do triangulo: ");
        base = scanner.nextFloat(); // Lê o valor da base

        System.out.print("Digite o valor da altura do triangulo: ");
        altura = scanner.nextFloat(); // Lê o valor da altura

        area = (base * altura) / 2; // Calcula a área do triângulo

        // SAIDA
        System.out.println("A area do triangulo retangulo e: " + area);

        scanner.close();
    }
}
