/*Ler um número inteiro e apresentar uma mensagem informando se o número é par ou impar.*/
import java.util.Scanner;
public class atividade8 {
    public static void main(String[] args) {
        // DECLARAÇÃO DE VARIAVEIS E ATRIBUICAOO
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = entrada.nextInt();

        // PROCESSAMENTO DE DADOS
        if (numero % 2 == 0) {
            //SAIDA
            System.out.println(" "+ numero + " e par.");
        } else {
            //SAIDA
            System.out.println(" "+ numero + " e impar.");
           
        }

        entrada.close();
    }
}
// O código verifica se o número é par ou ímpar e imprime a mensagem correspondente.