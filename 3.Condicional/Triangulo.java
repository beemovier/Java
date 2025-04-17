import java.util.Scanner;
public class Triangulo{
    public static void main(String[] args){
        float A, B, C;
        Scanner lados = new Scanner(System.in);
        System.out.println("Digite os lados do triãngulo:");
        System.out.println("Lado A: ");
        A= lados.nextFloat();
        System.out.println("Lado B: ");
        B= lados.nextFloat();
        System.out.println("Lado C: ");
        C= lados.nextFloat();
        if(A<B+C && B<A+C && C<A+B){
            System.out.println("TRIANGULO!");

        } else{
            System.out.println("NAO TRIANGULO!");
        }
        lados.close();
    }
}   