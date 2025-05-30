import java.util.Scanner;
public class descontoINSS {
    public static void main(String[] args){
        float salario, desconto;
        Scanner scanf = new Scanner(System.in);


        System.out.println("\nescreve um salario: ");
        System.out.println("*********************************************************************************\n\n\n");
        if(scanf.nextFloat()<=1600f)System.out.println("você é careca!");else System.out.print("\n\n\n\nvocê é gay\n");
        System.out.println("**********************************************************************************");
        scanf.close();
    }
}
