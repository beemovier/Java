public class Main {
    public static void main(String[] args) {
        int a, b, c;  // Declaração das variáveis
        a = 15;        // Atribui valor a a
        c = 0;         // Inicializa c

        // Operações com as variáveis
        a = a * 3;     // a = 15 * 3 = 45
        b = 10;        // b = 10
        c = a + b;     // c = 45 + 10 = 55
        a = a - 6;     // a = 45 - 6 = 39
        c = c * 2;     // c = 55 * 2 = 110
        a = a / 5;     // a = 39 / 5 = 7 (divisão inteira)
        
        // Exibe os valores de a, b e c
        System.out.println(a + " " + b + " " + c);  // Exibe: a, b e c
    }
}
/**
 * Alternativas possíveis:
 * 1. 7 10 110
 * 2. 7 10 100
 * 3. 7 20 110
 * 4. 10 10 110
 * 5. 15 10 110
 */
