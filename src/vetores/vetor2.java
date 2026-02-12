package vetores;

import construtores.Products;

import java.util.Locale;
import java.util.Scanner;

public class vetor2 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        Scanner sc =  new Scanner(System.in);

        int n = sc.nextInt();

        Products[] vect = new Products[n]; //Aqui cria uma instância de um vetor (array) que vai guardar Products.

        for (int i = 0; i < vect.length; i ++){
            sc.nextLine();
            String name = sc.nextLine();

            double price = sc.nextDouble();

            vect[i] = new Products(name, price);
            //Cria um objeto novo da classe com preço e nome.
            //Crie um novo produto com esses dados
            //e guarde ele na posição i do vetor
        }

        double sum = 0.0;

        for(int i = 0; i < vect.length; i++){
            sum += vect[i].getPrice(); //aqui ele pega somente o preço do vetor
        }

        double avg = sum / vect.length;
        System.out.printf("A média é de: " + avg);

        sc.close();
    }
}
