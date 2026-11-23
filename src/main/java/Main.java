public class Main {

    public static void main(String[] args) {

        Product product = new Product("Alma", 2.2, 50);
        Product product1 = new Product("Nar", 3.2, 15);
        Product product2 = new Product("Xurma", 2.5, 10);
        Product product3 = new Product("Alma", 2.2, 2);
        Product product4 = new Product("Alma", 3.2, 3);
        Cart prod = new Cart();

        prod.addProduct(product);
        prod.addProduct(product1);
        prod.addProduct(product2);
        prod.addProduct(product3);
        prod.addProduct(product4);

        prod.printBasket();
    }
}
