//Faça um algoritmo para ler um número inteiro e imprimir o seu valor 
//caso esteja no intervalo entre 50 e 100 (inclusive).
import java.util.Scanner;
public class atividade3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Escreve ai um inteiro: ");
        int numero = input.nextInt();
        System.out.println((numero>=50 && numero<=100)?"aqui ele: "+numero: null);
        input.close();
}                                  
}