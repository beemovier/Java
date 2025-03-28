import java.util.Scanner;

public class  exer3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura das 3 notas
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        // Calculando a média
        double media = (nota1 + nota2 + nota3) / 3;

        // Exibe a média do aluno 
        System.out.println("\nResultado: " + media);

        scanner.close();
    }
}
