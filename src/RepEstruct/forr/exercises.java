package RepEstruct.forr;

import java.util.Scanner;

public class exercises {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor digite um número: ");
        int numero1 = sc.nextInt();

        for (int numero = 1; numero < numero1; numero++){
            if (numero % 2 == 1){
                System.out.println(numero);
            }
        }
    }
}
