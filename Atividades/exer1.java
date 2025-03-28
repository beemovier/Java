import java.util.Scanner;

public class exer1 {
    public static void main(String[] args) {

        // Entrada
        int idade;
        char sexo;
        String nome;

        // Processamento
        Scanner escreva = new Scanner(System.in);

        System.out.print("Nome: ");
        nome = escreva.nextLine();

        System.out.print("Idade: ");
        idade = escreva.nextInt();

        System.out.print("Sexo: ");
        sexo = escreva.next().charAt(0);

        // Saida

        System.out.println("Informações:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);

        escreva.close();
    }
}
