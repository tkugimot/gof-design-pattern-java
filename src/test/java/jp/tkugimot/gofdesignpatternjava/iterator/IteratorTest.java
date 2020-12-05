package jp.tkugimot.gofdesignpatternjava.iterator;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class IteratorTest {
    @Test
    void test() {
        PaymentMethod paymentMethod1 = new PaymentMethod(
                "クレジットカード1"
        );
        PaymentMethod paymentMethod2 = new PaymentMethod(
                "クレジットカード2"
        );
        PaymentMethod paymentMethod3 = new PaymentMethod(
                "クレジットカード3"
        );
        PaymentMethod paymentMethod4 = new PaymentMethod(
                "銀行口座1"
        );
        PaymentMethod paymentMethod5 = new PaymentMethod(
                "銀行口座2"
        );

        List<PaymentMethod> paymentMethodList = new ArrayList<>();
        paymentMethodList.add(paymentMethod1);
        paymentMethodList.add(paymentMethod2);
        paymentMethodList.add(paymentMethod3);
        paymentMethodList.add(paymentMethod4);
        paymentMethodList.add(paymentMethod5);

        PaymentMethodAggregate paymentMethodAggregate = new PaymentMethodAggregate(
                paymentMethodList
        );

        PaymentMethodAggregateIterator iterator = paymentMethodAggregate.iterator();
        while(iterator.hasNext()) {
            PaymentMethod paymentMethod = iterator.next();
            System.out.println(paymentMethod.getName());
        }
    }
}
