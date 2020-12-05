package jp.tkugimot.gofdesignpatternjava.adapter.infrastructure;

import jp.tkugimot.gofdesignpatternjava.adapter.domain.GhibliEntity;
import jp.tkugimot.gofdesignpatternjava.adapter.domain.GhibliRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Repository
public class GhibliAdapterExtends extends GhibliApiClient implements GhibliRepository {

    public GhibliAdapterExtends(RestTemplate restTemplate) {
        super(restTemplate);
    }

    public GhibliEntity findOneById(String id) {
        GhibliApiResponse[] ghibliApiResponses = super.getAllGhibliIdAndTitle();
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
