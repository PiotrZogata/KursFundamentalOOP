package shoppingCartPackage;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<LineItem> lineItems = new ArrayList<>();
    //private List<Product> lineItems = new ArrayList<>();

    public void addLineItem(LineItem lineItem) {
        lineItems.add(lineItem);
    }

    //we need getPrice in class Product to  count total costs
    public int getTotalCost(){
        return lineItems.stream().mapToInt(LineItem::getPrice)
                .sum();
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "products=" + lineItems +
                '}';
    }
}
