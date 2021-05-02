package shoppingCartPackage;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {


    private List<Product> products = new ArrayList<>();

    // A newly created shopping cart is empty, so the constructor
    // needs no arguments.


    void  addProduct(Product product){
        products.add(product);
    }

    //we need getPrice in class Product to  count total costs
    int getTotalCost(){
        return products.stream().mapToInt(Product::getPrice).sum();
    }
}
