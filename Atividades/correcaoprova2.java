public class Main {
    public static void main(String[] args) {
        int a, b, c;  // Declaração das variáveis
        a = 10;        // Atribui valor a a
        c = 0;         // Inicializa c

        // Operações com as variáveis
        a = a + 5;     // a = 10 + 5 = 15
        b = 5;         // (b assume implicitamente o valor de 20 pelo enunciado)
        c = a * b;     // c = 15 * 5 = 75
        a = a / 3;     // a = 15 / 3 = 5

        // Exibe os valores de a, b e c
        System.out.println(a + " " + b + " " + c);  // Exibe: a, b e c
    }
}
