package jp.tkugimot.gofdesignpatternjava.factorymethod;

public class CreditCardFactory extends PaymentFactory {
    public CreditCard createPayment(String number) {
        return new CreditCard(number);
    }
}
