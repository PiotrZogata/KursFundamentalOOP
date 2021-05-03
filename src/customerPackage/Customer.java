package customerPackage;

import orderPackage.Order;
import orderPackage.Payment;
import shoppingCartPackage.ShoppingCart;

import java.util.Optional;

public class Customer {

    private final String name;
    private CreditCard creditCard;

    public Customer(String name, long ccNumber){
        this.name = name;
        this.creditCard = new CreditCard(ccNumber);
    }

    public Optional<Order> checkout(ShoppingCart cart){
        Optional<Payment> payment =
                creditCard.mkPayment(cart.getTotalCost());
        //return payment.isPresent() ? new orderPackage.Order(this, cart, payment.get()) : Optional.empty();
        return payment.map(value -> new Order(this, cart, value));
    }


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", creditCard=" + creditCard +
                '}';
    }
}
