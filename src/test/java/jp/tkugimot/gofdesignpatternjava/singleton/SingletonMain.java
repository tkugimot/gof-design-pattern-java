package jp.tkugimot.gofdesignpatternjava.singleton;

import org.junit.jupiter.api.Test;

class SingletonMain {

    @Test
    void singleton() {
        PaymentRepository paymentRepositoryOne = PaymentRepository.getInstance();
        PaymentRepository paymentRepositoryTwo = PaymentRepository.getInstance();

        System.out.println(paymentRepositoryOne == paymentRepositoryTwo);
    }
}
