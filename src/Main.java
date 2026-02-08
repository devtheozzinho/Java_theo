
import java.util.Scanner;
import funcionarios.Trabalhadores;

public static void main(String[] args) {


//    String product1 = "Computer";
//    String product2 = "Office desk";
//
//    int age = 30;
//    int code = 5290;
//    char gender = 'F';
//
//    double price1 = 2100.0;
//    double price2 = 650.50;
//    double measure = 53.234567;
//
//    System.out.println(product1 + " which price is" + price1);
//    System.out.println(product2 + " which price is " + price2);
//
//    System.out.println(age + " years old," + code + "and gender : " + gender);
//
//    System.out.println(" Measue with eight decimal places:" + measure);
//    System.out.println("Three decimal places" + );

//    int par;
//    int impar;
//
//    Scanner sc = new Scanner(System.in);
//
//    System.out.println("Digite um numero inteiro: ");
//    int numero = sc.nextInt();
//
//   if (numero % 2 == 0) {
//      System.out.println("Este é um numero par");
//   } else {
//       System.out.println("Este é um numero impar");
//        }
//    if (numero < 0){
//        System.out.println("Este é um numero negativo");
//    } else
//        if (numero > 0) {
//            System.out.println("Este é um numero positivo");
//    } else {
//            System.out.println("É o numero 0 krl, vai enganar outro bobo fdp");
//        }
//}

//    Scanner sc = new Scanner(System.in);
//
//    System.out.println("Favor digite o primeiro numero: ");
//    int numero1 = sc.nextInt();
//
//    System.out.println("Favor digite o segundo numero: ");
//    int numero2 = sc.nextInt();
//
//    int total = numero1 / numero2;
//
//    if (numero1 % numero2 == 0){
//        System.out.println("O " + numero1 + " é multiplo do numero " + numero2);
//    } else {
//        System.out.println("Estes numeros não sao multiplos fdp");
//    }
// }
//
//    Locale.setDefault(Locale.US);
//    Scanner sc = new Scanner(System.in);
//
//    Product product = new Product();
//
//    System.out.println("Por favor insira algo que eu esqueci: ");
//    System.out.println("Name ");
//    product.name = sc.nextLine();
//
//    System.out.print("Price ");
//    product.price = sc.nextDouble();
//
//    System.out.println("A quantidade no estoque");
//    product.quantity = sc.nextInt();
//
//
//    //Este print está saindo certinho assim por conta do toString() dentro de Product.java
//    System.out.println("Product data: " + product);
//
//    sc.close();

    Scanner sc = new Scanner(System.in);


    System.out.println("Por favor insira o seu salário: ");
    Trabalhadores trabalhadores = new Trabalhadores(); // na hora de fazer isso tem que criar com o nome da classe, se não da merda.

    System.out.println("Nome: ");
    trabalhadores.nome = sc.nextLine();

    System.out.println("Insira o salário: ");
    trabalhadores.salario_bruto = sc.nextDouble();

    System.out.println("Insira a taxa: ");
    trabalhadores.taxa = sc.nextDouble();

    double novaTaxa = sc.nextDouble();
    System.out.println("Por favor insira a noxa taxa: ");
    trabalhadores.aplicarNovaTaxa(novaTaxa);

    System.out.println(trabalhadores.novoSalario());
}





