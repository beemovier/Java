import java.io.FileWriter;
import java.io.IOException;
public class escreve {
    public static void main(String[] args){
        try{
            FileWriter escritor = new FileWriter("arquivo.txt");
            escritor.write("Essa é a primeira linha.\n");
            escritor.write("essa é a segunda linha.\n");
            escritor.close();
            System.out.println("Arquivo criado");} catch(IOException e){
                System.err.println("Erro ao tentar escrever: " + e.getMessage());
            }

        }


    }
    

