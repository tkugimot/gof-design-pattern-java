package jp.tkugimot.gofdesignpatternjava.adapter.infrastructure;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GhibliApiResponse {
    @JsonProperty(value = "id")
    private String id;

    @JsonProperty(value = "title")
    private String title;

    public GhibliApiResponse(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public GhibliApiResponse() {

    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}
