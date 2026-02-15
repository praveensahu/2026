package design_patterns.t_behavioral.strategy;

public class Client {
    public static void main(String[] args) {
        PaymentService pS = new PaymentService();
        pS.makePayment(new UpiPayment());
    }
}
