public class prova1 {
    public static void main(String[] args){

        float rubeola = 100000f, catapora = 200000f;
                int tempo = 1;

        while(rubeola<catapora){
            rubeola = (rubeola*1.1f);
            catapora = (catapora*1.06f);
            tempo++;
        }
        System.out.println(" o aumeunto é " + tempo*90 );

    }
}
//esqueci de adicionar o f. era melhor com double. na vdd isso tava certo
//o problema foi que usei unsigned pensei que tinha no java
//poderia mesmo ter usado double
