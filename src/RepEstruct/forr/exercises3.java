package RepEstruct.forr;

import java.util.Scanner;

public class exercises3 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Favor digite um numero inteiro: ");
        int numero_digitado = sc.nextInt();

        for (int novo_numero = 1; novo_numero <= numero_digitado; novo_numero++){
            if (numero_digitado % novo_numero == 0){
                System.out.println("Estes são os divisores do numero " + novo_numero);
            }
        }
    }
}
