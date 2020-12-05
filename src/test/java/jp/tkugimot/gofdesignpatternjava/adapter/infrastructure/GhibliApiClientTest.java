package jp.tkugimot.gofdesignpatternjava.adapter.infrastructure;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GhibliApiClientTest {
    @Autowired
    private GhibliApiClient target;

    @Test
    void getAllGhibliIdAndTitle() {
        GhibliApiResponse[] response = target.getAllGhibliIdAndTitle();
        System.out.println(response);
    }
}
