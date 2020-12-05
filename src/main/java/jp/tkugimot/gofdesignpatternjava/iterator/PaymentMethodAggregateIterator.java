package jp.tkugimot.gofdesignpatternjava.iterator;

public class PaymentMethodAggregateIterator implements Iterator {
    private PaymentMethodAggregate paymentMethodAggregate;
    private int index;

    /**
     * コンストラクタ
     */
    public PaymentMethodAggregateIterator(PaymentMethodAggregate paymentMethodAggregate) {
        this.paymentMethodAggregate = paymentMethodAggregate;
        this.index = 0;
    }

    /**
     * 次の要素があるかを判定して返す。
     */
    public boolean hasNext() {
        return index < paymentMethodAggregate.getSize();
    }

    public PaymentMethod next() {
        PaymentMethod paymentMethod = paymentMethodAggregate.getPaymentMethodAt(index);
        index++;
        return paymentMethod;
    }
}
