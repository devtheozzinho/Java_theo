package construtores;
import java.util.Locale;
import java.util.Scanner;


public class Produto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");

        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");

        double price = sc.nextDouble();


        Products product = new Products(name, price);

        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();

        product.setName("computer"); // Isso aqui muda o nome quando imprime na tela depois de ter colocado os dados no terminal

        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println();
        System.out.println("Updated data: " + product.getName());
        System.out.println();

        System.out.print("Enter the number of products to be removed from stock: ");

        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println();
        product.setPrice(1200.00);
        System.out.println("get price" + product.getPrice());
        System.out.println();
        sc.close();
    }
}
