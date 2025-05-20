import java.util.Scanner;
public class senha{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String key = "senha1", senha;
        senha = entrada.nextLine();
        if(senha.equals(key)){
            System.out.println("QUE PENA VOCÊ ACERTOU");
        }else{
            System.out.println("PARABENS, VOCÊ ERROU");
        }
        entrada.close();
    }
    
}
