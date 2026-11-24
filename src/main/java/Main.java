import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Cart prod = new Cart();
        Scanner sc = new Scanner(System.in);

        boolean running = true;

        while (running){
            System.out.println("============ PRODUCT MENYU ===========");
            System.out.print("1) Mehsul elave et\n" +
                               "2) Sebete bax\n" +
                               "3) Nomre ile sil\n" +
                               "4) Ad ile sil\n" +
                               "5) Umumi mebleg\n" +
                               "6) En bahali mehsul\n" +
                               "7) Sebeti bosalt\n" +
                               "8) Cix\n" +
                    "Zehmet olmasa seciminizi daxil edin: ");

            try {
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice){
                    case 1:
                        System.out.print("Mehsulun adini daxil edin: ");
                        String name = sc.nextLine();
                        System.out.print("Mehsulun qiymetini daxil edin: ");
                        double price = Double.parseDouble(sc.nextLine());
                        System.out.print("Mehsulun miqdarini daxil edin: ");
                        int quantity = Integer.parseInt(sc.nextLine());
                        Product product = new Product(name, price, quantity);
                        prod.addProduct(product);
                        break;
                    case 2:
                        prod.printBasket();
                        break;
                    case 3:
                        System.out.print("Zehmet olmasa silmek istediyiniz mehsulun nomresin daxil edin: ");
                        prod.removeByNumber(Integer.parseInt(sc.nextLine()));
                        break;
                    case 4:
                        System.out.print("Zehmet olmasa silmek istediyiniz mehsulun adini daxil edin: ");
                        prod.removeByName(sc.nextLine());
                        break;
                    case 5:
                        System.out.println(prod.priceAllProduct());
                        break;
                    case 6:
                            System.out.println(prod.mostExpensive());
                        break;
                    case 7:
                        prod.emptyTheBasket();
                        break;
                    case 8:
                        running = false;
                        break;
                    default:
                        System.out.println("Yanlis reqem secmisiniz");
                }
            }catch (NumberFormatException e){
                System.out.println("Zehmet olmasa reqem daxil edin");
            }
        }

    }
}
