package customerPackage;

import orderPackage.Payment;
import orderPackage.PaymentMethod;

import java.util.Optional;
import java.util.UUID;

public class CreditCard implements PaymentMethod {

// final a unique number of card
    private  final long cardNumber;

    CreditCard(long cardNumber){
        this.cardNumber = cardNumber;
    }

    public Optional <Payment> mkPayment(int value){
        if (Math.random() > 0.3){
            return Optional.of(new Payment(this, value, UUID.randomUUID()));
        } else {
            //in case the card is exhausted
            //return null;
            return Optional.empty();
        }
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardNumber=" + cardNumber +
                '}';
    }
}
