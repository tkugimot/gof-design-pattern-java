package jp.tkugimot.gofdesignpatternjava.templatemethod;

public class CreditCard {
    private String number;
    private String securityCode;
    private String expiration;

    public CreditCard(
            String number,
            String securityCode,
            String expiration
    ) {
        this.number = number;
        this.securityCode = securityCode;
        this.expiration = expiration;
    }

    public String getNumber() {
        return number;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public String getExpiration() {
        return expiration;
    }
}
