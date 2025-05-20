import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class le {
    public static void main (String[] args){
        try{
            File arquivo = new File("arquivo.txt");
            Scanner leitor = new Scanner(arquivo);
            System.out.println("lendo o arquivo: ");
            while(leitor.hasNextLine()){
                String linha = leitor.nextLine();
                System.out.println(linha);
            }
            leitor.close();
        } catch(FileNotFoundException e){
            System.err.println("Arquivo não encontrado: " + e.getMessage());
        }
    }    
}
