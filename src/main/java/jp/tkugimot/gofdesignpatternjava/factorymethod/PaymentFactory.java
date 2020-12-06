package jp.tkugimot.gofdesignpatternjava.factorymethod;

public abstract class PaymentFactory {
    private int number;

    public final Payment create(String number) {
        Payment payment = createPayment(number);
        incrementNumber();
        return payment;
    }

    protected abstract Payment createPayment(String number);

    private void incrementNumber() {
        number++;
    }
}
