import java.util.Scanner;

public class errosretorno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = 0 ;
        while (true) {
            try {
                System.out.print("Digite um numero inteiro: ");
                numero = entrada.nextInt();
                break; // sai do loop se deu tudo certo
            } catch (Exception e) {
                System.err.println("Erro: Tente de novo.");
                entrada.nextLine(); // limpa o buffer da entrada
            }
            System.out.println(String.format("O numero que digitaste: %d",numero));
        }
        entrada.close();

    }
}
