import java.util.Scanner;

public class exer3 {
    public static void main(String[] args) {

        // ENTRADA
        double nota1;
        double nota2;
        double nota3;
        double media;

        // PROCESSAMENTO
        Scanner escreva = new Scanner(System.in);

        // Leitura das 3 notas
        System.out.print("Digite a primeira nota: ");
        nota1 = escreva.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = escreva.nextDouble();

        System.out.print("Digite a terceira nota: ");
        nota3 = escreva.nextDouble();

        // Calculando a média
        media = (nota1 + nota2 + nota3) / 3;

        // Exibe a média do aluno
        System.out.println("\nResultado: " + media);

        escreva.close();
    }
}
