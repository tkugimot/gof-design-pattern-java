package jp.tkugimot.gofdesignpatternjava.templatemethod;

public class CreditCardDisplay extends AbstractDisplay {
    private CreditCard creditCard;

    public CreditCardDisplay(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public void open() {
        System.out.println("---credit card open---");
    }

    public void print() {
        System.out.println(
                String.format(
                        "ccnum: %s, security-code: %s, expiration: %s",
                        creditCard.getNumber(),
                        creditCard.getSecurityCode(),
                        creditCard.getExpiration()
                )
        );
    }

    public void close() {
        System.out.println("---credit card close---");
    }
}
