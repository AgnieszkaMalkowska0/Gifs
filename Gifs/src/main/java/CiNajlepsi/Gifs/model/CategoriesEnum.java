package CiNajlepsi.Gifs.model;

public enum CategoriesEnum {
    PROGRAMMING("programming"),BOT("bot"),FUNNY("funny"),SCIENCE("science"),OTHER("other");

    private String id;

    CategoriesEnum(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
