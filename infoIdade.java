import java.util.Scanner;
public class infoIdade {
    
    public static void main(String[] argumento) {
        Scanner in = new Scanner(System.in);
        while(true){
        System.out.print("Forneça sua idade: ");
        short idade = in.nextShort();
        if(idade > 0){
            if(idade <18){
                System.out.println(" É de Menor\n");
            } else if(idade>=18 && idade <65){
                System.out.println(" Já pode ser preso\n");
        }else{System.out.println(" Vai morrer logo\n");}
            
            
        }else{System.out.println("Vc nem existe\n");
            System.out.println("Encerrando...\n");
            break;
        }
        }
        in.close();
        }
        
    }
    
