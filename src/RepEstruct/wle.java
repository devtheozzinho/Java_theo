package RepEstruct;

//estrutura de repetição while

import java.util.Scanner;

public class wle {
    public static void main(String[] args){

        int numero = 1;
        while (numero < 10){
            System.out.println(numero);
            numero++;
        }

        int numero1 = 10;

        while (numero1 < 11){
            numero1++;
            if (numero1 == 9) break;
            System.out.println("Chegamos no numero 9 mas o original era pra ser " + numero1);
        }


//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Por favor digite sua senha: ");
//        int senha = sc.nextInt();
//
//        while (senha != 2002){
//            System.out.println("Por favor digite novamente a sua senha:");
//            senha = sc.nextInt();
//        }
//        System.out.println("Senha correta");
//
//
        Scanner cs = new Scanner(System.in);

        System.out.println("Por favor digite sua preferencia entre 1 a 4 :");

        int preferencia = cs.nextInt();

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;


        while (preferencia != 4){

        switch (preferencia) {
            case 1:
                alcool++;
                break;
            case 2:
                gasolina++;
                break;
            case 3:
                diesel++;
                break;


        }
            preferencia = cs.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        cs.close();

    }

}
