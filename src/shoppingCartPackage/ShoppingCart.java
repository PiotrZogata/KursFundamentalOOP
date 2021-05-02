package shoppingCartPackage;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {


    private List<Product> products = new ArrayList<>();

    // A newly created shopping cart is empty, so the constructor
    // needs no arguments.


    public void  addProduct(Product product){
        products.add(product);
    }

    //we need getPrice in class Product to  count total costs
    public int getTotalCost(){
        return products.stream().mapToInt(Product::getPrice).sum();
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "products=" + products +
                '}';
    }
}
