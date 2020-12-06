package jp.tkugimot.gofdesignpatternjava.templatemethod;

import org.junit.jupiter.api.Test;

class TemplateMethod {

    @Test
    void templateMethod() {
        BankAccount bankAccount = new BankAccount(
                "0001",
                "001",
                "1234567"
        );
        AbstractDisplay bankAccountDisplay = new BankAccountDisplay(bankAccount);

        CreditCard creditCard = new CreditCard(
                "1234123412341234",
                "111",
                "2022/12"
        );
        AbstractDisplay creditCardDsiplay = new CreditCardDisplay(
                creditCard
        );

        bankAccountDisplay.display();
        creditCardDsiplay.display();
    }
}
