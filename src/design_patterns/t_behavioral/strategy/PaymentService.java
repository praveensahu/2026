package design_patterns.t_behavioral.strategy;

import design_patterns.t_behavioral.strategy.IPayment.Payment;

public class PaymentService {
    Payment payment;

       public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void makePayment(Payment payment){
           payment.pay();
    }
}
