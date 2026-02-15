package design_patterns.t_behavioral.strategy;

import design_patterns.t_behavioral.strategy.IPayment.Payment;

public class UpiPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Upi Card");
    }
}
