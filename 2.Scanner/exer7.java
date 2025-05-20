import java.util.Scanner;

public class exer7 {
    public static void main(String[] args) {
        Scanner escreva = new Scanner(System.in);

        // ENTRADA DE DADOS
        int anoNascimento;
        int anoAtual;
        int idade;
        
        // PROCESSAMENTO
        System.out.print("Digite o ano de nascimento: ");
        anoNascimento = escreva.nextInt(); // Lê o ano de nascimento

        System.out.print("Digite o ano atual: ");
        anoAtual = escreva.nextInt(); // Lê o ano atual

        
        idade = anoAtual - anoNascimento; // Calcula a idade

        // SAIDA
        System.out.println("A idade da criatura: " + idade + " anos.");

        escreva.close();
    }
}
