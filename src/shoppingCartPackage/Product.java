package shoppingCartPackage;

public class Product {

    private final String name;
    private int price;
    private ProductType type;
    private int discount;
    private int weight;


    public Product(String name, int price, ProductType type, int weight){
        this.name = name;
        this.price = price;
        this.type = type;
        this.weight = weight;
    }

    public int getPrice() {
        int shippingCost = type.getShippingCost(weight);
        return Math.round((1 - discount) * price) + shippingCost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", type=" + type +
                ", weight=" + weight +
                '}';
    }
}
