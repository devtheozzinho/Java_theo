package Ternarions;


// estrutura do operador ternário

//      ( condição ) ? valor_se_verdadeiro : valor_se_falso

import java.util.Scanner;

public class tern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        double preco = sc.nextInt();

        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

        System.out.println("O valor do desconto será de: " + desconto);

        double preco_novo = preco - desconto;

        System.out.println("O novo valor do produto é de: " + preco_novo);
    }
}
