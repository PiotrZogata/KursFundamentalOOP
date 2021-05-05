package shoppingCartPackage;

import java.util.Map;

public class Catalogue {
    public static final int SHIPPING_RATE = 5;




    private static Map<String, Product> productMap = Map.of(
            "Electric Toothbrush", new Product("Electric Toothbrush", 3550, ProductType.PHYSICAL, 400),
            "Baby Alarm", new Product("Baby Alarm", 3550, ProductType.PHYSICAL, 500),
            "War and Peace (e-book)", new Product("War and Peace (e-book)", 100, ProductType.DIGITAL, 0)
    );

    public static Product getProduct(String productName) {
        return productMap.get(productName);
    }
}
