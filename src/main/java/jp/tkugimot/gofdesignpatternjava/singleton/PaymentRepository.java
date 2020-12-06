package jp.tkugimot.gofdesignpatternjava.singleton;

public class PaymentRepository {
    private static PaymentRepository paymentRepository = new PaymentRepository();
    private PaymentRepository() {
        System.out.println("Create instance.");
    }
    public static PaymentRepository getInstance() {
        return paymentRepository;
    }
}
