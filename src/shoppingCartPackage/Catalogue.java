package shoppingCartPackage;

import java.util.Map;

public class Catalogue {

    //no need instance class No catalogue instances will ever be created.

    //alternative
    //Factory methods like this are increasingly popular as an alternative to constructors.
    private static Map<String, Product> productMap = Map.of(
            "Electric Toothbrush", new Product("Electric Toothbrush", 3550),
            "Baby Alarm", new Product("Baby Alarm", 3550)
    );

    public static Product getProduct(String productName) {
        return productMap.get(productName);
    }
}
