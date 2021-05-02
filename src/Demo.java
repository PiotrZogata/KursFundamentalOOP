import shoppingCartPackage.Catalogue;
import shoppingCartPackage.Product;
import shoppingCartPackage.ShoppingCart;

public class Demo {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

//        Product toothbrush = new Product("Electric Toothbrush", 3550);
//        Product babyAlarm = new Product("Baby alarm", 4999);

        Product toothbrush = Catalogue.getProduct("Electric Toothbrush");


        cart.addProduct(toothbrush);
        cart.addProduct(babyAlarm);

        System.out.println(cart);
        System.out.println(cart.getTotalCost());


    }
}
