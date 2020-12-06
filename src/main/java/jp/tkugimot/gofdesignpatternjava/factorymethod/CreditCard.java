package jp.tkugimot.gofdesignpatternjava.factorymethod;

public class CreditCard extends Payment {
    private String number;
    public CreditCard(String number) {
        this.number = number;
    }
    public void pay() {
        System.out.println("pay with number: " + number);
    }
}
