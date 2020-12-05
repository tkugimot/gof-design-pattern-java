package jp.tkugimot.gofdesignpatternjava.adapter.infrastructure;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class GhibliApiClient {
    private final RestTemplate restTemplate;
    private static final String uri = "https://ghibliapi.herokuapp.com/films?fields=title,id";

    public GhibliApiClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public GhibliApiResponse[] getAllGhibliIdAndTitle() {
        return restTemplate.getForEntity(
                uri,
                GhibliApiResponse[].class
        ).getBody();
    }
}
