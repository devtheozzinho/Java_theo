package RepEstruct.forr;

import java.util.Scanner;

public class exercises4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Favor digite um número inteiro: ");
        int numero_digitado = sc.nextInt();

        for (int linhas = 1; linhas <= numero_digitado; linhas++) {
            System.out.println(
                    linhas + " " +
                            (linhas * linhas) + " " +
                            (linhas * linhas * linhas)
            );  
        }
        sc.close();
    }
}
