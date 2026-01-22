package RepEstruct;

// estrutura básica do FOR:
// for ( inicialização; condição; incremento) {
//bloco de código aqui
// }

public class forJava {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) { // inicia a variavel como 0, enquanto for menor que 5, adiciona +1.
            System.out.println(" O valor de i é: " + i);  // exemplo básico de como funciona um for
        }

        for (int t = 1; t <= 10; t++) {
            if (t % 2 == 0) {
                System.out.println("O valor de t é: " + t);
            }
        }
        for (int a = 1; a <= 10; a++) {
            if (a == 5) {  // for com IF usando um break caso o A seja = 5
                break;
            }
            System.out.println("O valor de a é de: " + a);
        }
        for (int z = 1; z <= 3; z++) {
            if (z == 2) {  // for com IF usando o CONTINUE caso o z seja igual a 2
                continue;
            }
            System.out.println("O valor de z é de: " + z);
        }

        int[] numeros = {10, 20, 30, 40, 50};

        for (int b = 0; b < numeros.length; b++) { //for utilizando Arrays
            System.out.println("O valor de b: " + b);
        }


        // Sintaxe do for-each
        // for ( tipo_variavel : coleção) {
        //          bloco de código aqui
        //}
        // O for-each serve apenas para percorrer os valores de um array (ou coleção) e
        // colocar cada valor, um por vez, dentro da variável criada no for

        int[] numero1 = {10, 20, 30,};

        for (int numeroo : numero1) {
            System.out.println("O valor de numero é: " + numeroo);
        }
    }

}
