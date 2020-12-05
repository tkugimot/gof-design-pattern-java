package jp.tkugimot.gofdesignpatternjava.adapter.infrastructure;

import jp.tkugimot.gofdesignpatternjava.adapter.domain.GhibliEntity;
import jp.tkugimot.gofdesignpatternjava.adapter.domain.GhibliRepository;
import org.springframework.stereotype.Repository;

import java.util.Arrays;

@Repository
public class GhibliAdapterTransfer implements GhibliRepository {
    private final GhibliApiClient ghibliApiClient;

    public GhibliAdapterTransfer(GhibliApiClient ghibliApiClient) {
        this.ghibliApiClient = ghibliApiClient;
    }

    public GhibliEntity findOneById(String id) {
        GhibliApiResponse[] ghibliApiResponses = ghibliApiClient.getAllGhibliIdAndTitle();
        GhibliApiResponse target = Arrays.stream(ghibliApiResponses)
                .filter(el -> el.getId().equals(id))
                .findFirst()
                .get();

        return new GhibliEntity(
                target.getId(),
                target.getTitle()
        );
    }
}
