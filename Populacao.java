public class Populacao {
    public static void main(String[] args) {
        float cidadeA, cidadeB;
        cidadeA = 5000000;
        cidadeB = 7000000;
        int tempo = 0; // Inicializando a variável tempo

        while(cidadeA <= cidadeB) {
            cidadeA *= 1.03f;
            cidadeB *= 1.02f;
            tempo++; // Incrementando tempo corretamente
        }

        System.out.println("Vai demorar " + tempo + " anos\n CidadeA= "+cidadeA+"\nCidadeB= "+cidadeB);
    }
}