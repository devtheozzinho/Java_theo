package product;

public class Product {

    public String name;
    public Double price;
    public int quantity;  // atributo da classe

    public Double totalValueInStock(){
        return price * quantity;
    }

    //parametro do metodo
    public void addProducts(int quantity){
        this.quantity += quantity;  // o this referencia o atributo da classe. Isso é o que chamamos de poliformismo
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    public String toString(){  // esse toString serve só para mostrar como deve retornar no print quando compilar.
        return name
                + ", $" // só ima mensagem
                + String.format("%.2f", price) //isso aqui só formata para as casas decimais ficarem certinhas
                + ", " // concatenação
                + quantity // printa a quantidade
                + " units, Total: $ " // só uma mensagem
                + totalValueInStock(); // printa este metodo que foi criado ali em cima
    }
}
