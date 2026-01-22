import Ternarions.CIrculo;
import Ternarions.Triangle;

import java.util.Scanner;

public class OoJavinha {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Triangle x, y;

        x = new Triangle();
        y = new Triangle();

        System.out.println("Por favor digite as primeiras medidas do triangulo: ");

        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Por favor digite novas medidas do triangulo: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();


        CIrculo diamentro, raio, area, pI;

        diamentro = new CIrculo();
        raio = new CIrculo();
        area = new CIrculo();
        pI = new CIrculo();

        System.out.println("Por favor digite o diametro deste circulo: ");

        diamentro.d = sc.nextDouble();
//        raio.r = sc.nextDouble();
//        area.a1 = sc.nextDouble();
//        pI.pi = sc.nextDouble();

        double raio_circulo = raio.r / 2;
        double area_circulo = pI.pi * raio.r * raio.r;
        System.out.println("O raio deste circulo é de " + diamentro.d + "e sua área é de " + diamentro.a1);

        double p1 = (x.a + x.b + x.c);
        double arreax = (x.a * x.b) / 2;
        System.out.println("Sua área é de " + arreax);

        if (x.a == x.b && x.b == x.c) {
            System.out.println("Este é um trinagulo Equilátero e sua área é de " + arreax + "e seu perimetro é de " + p1);
        } else if (x.a == x.b && x.b != x.c) {
            System.out.println("Este é um triangulo Isóceles e sua área é de " + arreax + "e seu perimetro é de " + p1);
        } else {
            System.out.println("Este é um triangulo Escaleno e sua área é de " + arreax + "e seu perimetro é de " + p1);
        }

        double p2 = (y.a + y.b + y.c);
        double areay = (y.a * y.b) / y.c;

        if (y.a == y.b && y.b == y.c) {
            System.out.println("Este é um trinagulo Equilátero e sua área é de : " + areay + "e seu permitro é de " + p2);
        } else if (y.a == y.b && y.b != y.c) {
            System.out.println("Este é um triangulo Isóceles e sua área é de " + areay + "e seu perimetro é de " + p2);
        } else {
            System.out.println("Este é um triangulo Escaleno e sua área é de " + areay + "e seu perimetro é de " + p2);
        }
        sc.close();
    }
}
