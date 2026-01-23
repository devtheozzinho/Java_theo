import Ternarions.CIrculo;
import Ternarions.Triangle;
import Ternarions.quadradio;
import Ternarions.cubo;

import java.util.Scanner;

public class OoJavinha {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        CIrculo diamentro;
        quadradio area1;
        cubo area_cubo;

        area1 = new quadradio();

        x = new Triangle();

        diamentro = new CIrculo();

        area_cubo = new cubo();

        System.out.println("Por favor digite as primeiras medidas do triangulo: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Por favor digite o diametro deste circulo: ");
        diamentro.d = sc.nextDouble();


        System.out.println("Por favor insira os lados do quadrado: ");
        area1.lado1 = sc.nextDouble();
        area1.lado2 = sc.nextDouble();

        area_cubo.lado = sc.nextDouble();

        diamentro.r = diamentro.d / 2;
        diamentro.a1 = diamentro.pi * diamentro.r * diamentro.r;
        System.out.println("O raio deste circulo é de " + diamentro.d + " e sua área é de " + diamentro.a1);

        double p1 = (x.a + x.b + x.c);
        double arreax = (x.a * x.b) / 2;
        System.out.println("Sua área é de " + arreax);

        if (x.a == x.b && x.b == x.c) {
            System.out.println("Este é um trinagulo Equilátero e sua área é de " + arreax + "e seu perimetro é de " + p1);
        } else if (x.a == x.b && x.b != x.c) {
            System.out.println("Este é um triangulo Isóceles e sua área é de " + arreax + " e seu perimetro é de " + p1);
        } else {
            System.out.println("Este é um triangulo Escaleno e sua área é de " + arreax + " e seu perimetro é de " + p1);
        }

        double area_quadrado = area1.lado1 * area1.lado2;
        System.out.println("Está á a área do quadrado que vc escolheu " + area_quadrado);

        double perimetro_quadrado = area_quadrado * 2;
        System.out.println("O perimetro do quadrado é de: " + perimetro_quadrado);

        double diagonal_quadrado = area1.lado1 * Math.sqrt(2);
        System.out.printf("A diagonal deste quadrado é de : %.2f%n " , diagonal_quadrado);

        double area_cubinbo = 6 * Math.pow(area_cubo.lado, 2);
        sc.close();
    }
}
