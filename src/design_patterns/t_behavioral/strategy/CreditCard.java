package design_patterns.t_behavioral.strategy;

import design_patterns.t_behavioral.strategy.IPayment.Payment;

public class CreditCard implements Payment {
    @Override
    public void pay() {
        System.out.println("Credit Card");
    }
}
