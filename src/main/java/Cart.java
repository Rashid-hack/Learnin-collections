import java.util.ArrayList;
import java.util.List;

public class Cart {

    private final List<Product> productList = new ArrayList<>();


    public void addProduct(Product product) {
        for (Product p : productList){
            if (p.getName().equalsIgnoreCase(product.getName())){
                p.growQuantity(product.getQuantity());
                return;
            }
        }
        productList.add(product);
    }

    public void printBasket() {
        if (productList.isEmpty()) {
            System.out.println("Sebet bosdur!");
            return;
        }
        for (int i = 0; i < productList.size(); i++) {
            System.out.println((i + 1) + ") " + productList.get(i));
        }
    }

    public void removeByNumber(int number) {
        if (productList.isEmpty()) {
            System.out.println("Sebet bosdur!");
            return;
        }
        if (number <= 0 || number > productList.size()) {
            System.out.println("Siyahida olmayan reqem daxil etmisiniz! Mehsullarin siyahisi: ");
            for (int i = 0; i < productList.size(); i++) {
                System.out.println((i + 1) + ") " + productList.get(i));
            }
            return;
        }

        System.out.println("Mehsul ugurla silindi: " + productList.remove(number - 1));

    }

    public void removeByName(String name) {
        if (productList.isEmpty()) {
            System.out.println("Sebet bosdur!");
            return;
        }
        for (Product product : productList) {
            if (product.getName().equalsIgnoreCase(name)) {
                productList.remove(product);
                System.out.println("Silinen " + product);
                return;
            }
        }
        System.out.println("Bele bir mehsul yoxdur!");
    }

    public double priceAllProduct() {
        double allPrice = 0;
        for (Product p : productList) {
            allPrice += p.getPrice() * p.getQuantity();
        }
        return allPrice;
    }

    public Product mostExpensive() {
        Product product = null;
        for (Product p : productList) {
            if (product == null || p.getPrice() >= product.getPrice()) {
                product = p;
            }
        }
        return product;

    }

    public void emptyTheBasket() {
        productList.clear();
    }

}
