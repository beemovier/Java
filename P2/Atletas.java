//receber nome, idade, peso e altura  e depois imprimir:
//nome dos atletas com peso entre 65 e 75kg
//quantidade de atletas com altura de 1,65;
//media das idades  

import java.util.Scanner;

public class Atletas {
    public static void main(String[] args) {
        String[] nome;
        int[] idade;
        int contador=0, quantidade=0;
        float[] peso;
        float[] altura;
        Scanner inp = new Scanner(System.in);
        for (int i = 0; i <= 10; i++) {
            System.out.println("nome:");
            nome[i]= inp.nextLine();
            System.out.println("peso: ");
            peso[i] = inp.nextFloat();
            if(peso[i]>=65f && peso[i]<=75f)System.out.println(nome);
            System.out.println("idade:");
            idade[i] = inp.nextInt(); 
            contador += idade[i];
            System.out.println("Altura: ");
            altura[i]=inp.nextFloat();
            if(altura[i]==1.65f){quantidade++;}

        }
        System.out.println("Atletas com maid de 1,65"+quantidade);
         System.out.println("Média de idades:"+ (contador>>1));
    }
}