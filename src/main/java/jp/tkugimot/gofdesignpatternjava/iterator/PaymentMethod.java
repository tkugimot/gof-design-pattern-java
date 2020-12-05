package jp.tkugimot.gofdesignpatternjava.iterator;

/**
 * 支払い方法
 */
public class PaymentMethod {
    /**
     * 支払い方法の名前
     */
    private String name;

    public PaymentMethod(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
