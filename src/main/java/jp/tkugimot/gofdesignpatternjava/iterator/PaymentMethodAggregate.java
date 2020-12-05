package jp.tkugimot.gofdesignpatternjava.iterator;

import java.util.List;

/**
 * 支払い方法の集合
 */
public class PaymentMethodAggregate implements Aggregate {
    private List<PaymentMethod> paymentMethods;

    /**
     * コンストラクタ
     * 指定した maxSize の大きさの支払い方法の集合を作成する。
     */
    public PaymentMethodAggregate(List<PaymentMethod> paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    /**
     * 指定したindexの支払い方法を取得
     */
    public PaymentMethod getPaymentMethodAt(int index) {
        if (index >= paymentMethods.size()) {
            throw new RuntimeException("Exceeds payment methods' size");
        }
        return this.paymentMethods.get(index);
    }

    /**
     * 支払い方法を追加
     */
    public void addPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethods.add(paymentMethod);
    }

    /**
     * 支払い方法集合の大きさを返す
     */
    public int getSize() {
        return this.paymentMethods.size();
    }

    /**
     * Iteratorを返す。
     */
    public PaymentMethodAggregateIterator iterator() {
        return new PaymentMethodAggregateIterator(this);
    }
}
