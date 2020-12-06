package jp.tkugimot.gofdesignpatternjava.factorymethod;

import org.junit.jupiter.api.Test;

class FactoryMain {

    @Test
    void factory() {
        PaymentFactory paymentFactory = new CreditCardFactory();
        Payment creditCard = paymentFactory.create("1234123412341234");
        creditCard.pay();
    }
}
