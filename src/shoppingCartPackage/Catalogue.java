package shoppingCartPackage;

import java.util.Map;

public class Catalogue {
    public static final int SHIPPING_RATE = 5;




    private static Map<String, Product> productMap = Map.of(
            "Electric Toothbrush", new PhysicalProduct("Electric Toothbrush", 3550, 400),
            "Baby Alarm", new PhysicalProduct("Baby Alarm", 3550, 500),
            "War and Peace (e-book)", new DigitalProduct("War and Peace (e-book)", 100)
    );

    public static Product getProduct(String productName) {
        return productMap.get(productName);
    }
}
