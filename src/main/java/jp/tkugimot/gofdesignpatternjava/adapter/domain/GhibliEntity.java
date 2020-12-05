package jp.tkugimot.gofdesignpatternjava.adapter.domain;

public class GhibliEntity {
    private String id;
    private String title;

    public GhibliEntity(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
