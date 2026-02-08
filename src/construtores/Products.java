package construtores;

public class Products {
    String name;
    private double price;
    private int quantity;

    public Products(String name, double price, int quantity){  //Construtor da classe
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Products(String name, double price){  //Construtor da classe quando tem sobrecarga
        this.name = name;                        // Sobrecarga é quando criamos vários métodos com o mesmo nome, mas com parâmetros diferentes.
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getQuantity(){
        return quantity;
    }

    public double totalValueInStock() {
        return price * quantity;
    }
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }
    public void removeProducts(int quantity) {
        this.quantity-= quantity;
    }
    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
