package customerPackage;

import orderPackage.Payment;

import java.util.Optional;
import java.util.UUID;

public class CreditCard {

// final a unique number of card
    private  final long cardNumber;

    CreditCard(long cardNumber){
        this.cardNumber = cardNumber;
    }

    //giving transaction 70% success, if does than in CreditCard an object orderPackage.Payment is made, using unique number

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
