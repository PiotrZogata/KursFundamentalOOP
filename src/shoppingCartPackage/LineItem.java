package shoppingCartPackage;

import shoppingCartPackage.Product;

import java.util.function.Predicate;

public class LineItem {

    private final Product product;
    private final int quantity;

    public LineItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    //Constructor
    public LineItem(LineItem li) {
        this(li.product, li.quantity);
    }

    public int calculateShippingCost() {
        return product.calculateShippingCost() * quantity;
    }

    public Product getProduct(){
        return product;
    }

    @Override
    public String toString() {
        return "shoppingCartPackage.LineItem{" +
                "product=" + product +
                ", quantity=" + quantity +
                '}';
    }

    public int getPrice(){
        return product.getPrice() * quantity;
    }
}
