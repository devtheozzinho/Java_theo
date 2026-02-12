package vetores;

import java.util.Locale;
import java.util.Scanner;

public class vetor {

    public static void main(String[]args){

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vect = new double[n];   // Isso aqui é um vetor, seu burrão.

        for (int i = 0; i < n; i++){
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;

        for (int t = 0; t < n; t++){
            sum += vect[t];
        }

        double avg = sum / n;

        System.out.println("A media é de: " + avg);





        sc.close();
    }
}
