package shoppingCartPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ShoppingCart {

    private List<LineItem> lineItems = new ArrayList<>();
    //private List<Product> lineItems = new ArrayList<>();

    public void addLineItem(LineItem lineItem) {
            lineItems.add(lineItem);
        }



    public int getTotalCost(){
        return lineItems.stream()
                .mapToInt(LineItem::getPrice)
                .sum();
    }

    //DEFENSIVE COPYING 
    public List<LineItem> getLineItems() {
        return lineItems.stream()
                .map(LineItem::new) //copy CONSTRUCTOR
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "products=" + lineItems +
                '}';
    }
}
