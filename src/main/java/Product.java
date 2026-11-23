public class Product {

    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void growQuantity(int size){
        if (size <= 0){
            System.out.println("Daxil edilen deyer menfi ve ya sifir ola bilmez!");
        }
       this.quantity += size;
    }

    @Override
    public String toString() {
        return "Mehsulun adi: " + name + ", Qiymet: " + price + ", Miqdar: " + quantity;
    }
}
