package orderPackage;

import java.util.Optional;

public interface PaymentMethod {
    public Optional<Payment> mkPayment(int amount);
}