package jp.tkugimot.gofdesignpatternjava.adapter;

import jp.tkugimot.gofdesignpatternjava.adapter.domain.GhibliEntity;
import jp.tkugimot.gofdesignpatternjava.adapter.infrastructure.GhibliAdapterExtends;
import jp.tkugimot.gofdesignpatternjava.adapter.infrastructure.GhibliAdapterTransfer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class AdapterTest {
    @Autowired
    private GhibliAdapterTransfer ghibliAdapterTransfer;

    @Autowired
    private GhibliAdapterExtends ghibliAdapterExtends;

    @Test
    void adapter() {
        GhibliEntity actualTransfer = ghibliAdapterTransfer.findOneById(
                "2baf70d1-42bb-4437-b551-e5fed5a87abe"
        );
        assertThat(actualTransfer.getTitle()).isEqualTo("Castle in the Sky");

        GhibliEntity actualExtends = ghibliAdapterTransfer.findOneById(
                "2baf70d1-42bb-4437-b551-e5fed5a87abe"
        );
        assertThat(actualExtends.getTitle()).isEqualTo("Castle in the Sky");
    }
}
