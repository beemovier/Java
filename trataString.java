import java.util.Scanner;
public class trataString {
   public static String padrao(String x){
       return x = x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase();
    }
    public static void main(String[] banana){
        
        Scanner entrada = new Scanner(System.in);
        while(true){
            System.out.println("Escreva seu nome de qualquer jeito:");
            String usuario = entrada.nextLine();

if (usuario.equals(usuario.toLowerCase())) {
    // Se a string inteira está em minúsculo, deixamos a primeira letra em maiúsculo
    usuario = usuario.substring(0, 1).toUpperCase() + usuario.substring(1).toLowerCase();
} else if (usuario.equals(usuario.toUpperCase())) { usuario=padrao(usuario);
    // Se a string inteira está em maiúsculo, deixamos a primeira letra em maiúsculo e o restante em minúsculo
    
} else {usuario= padrao(usuario);
    // Caso a string tenha mistura de maiúsculas e minúsculas, apenas corrigimos a primeira letra
}
            if (usuario.equals("Exit")){break;}
            
System.out.println("\n Seu nome é: "+ usuario+"\n\n");
    
        
    }
    entrada.close();
    }
}