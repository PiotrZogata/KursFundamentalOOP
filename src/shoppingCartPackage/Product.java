package shoppingCartPackage;

public abstract class Product {

    public final String name;
    public int price;
    private int productDiscount;

    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        int shippingCost = calculateShippingCost();
        return Math.round((1 - productDiscount) * price) + shippingCost;
    }

    protected abstract int calculateShippingCost();

    public void setProductDiscount(int productDiscount) {
        this.productDiscount = productDiscount;
    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", discount=" + productDiscount +
                '}';
    }
}
