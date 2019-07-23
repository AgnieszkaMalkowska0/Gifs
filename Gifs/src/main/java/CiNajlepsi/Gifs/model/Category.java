package CiNajlepsi.Gifs.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Agnieszka on 23.07.2019.
 */
public class Category {

    private String id;

    private String name;


public static List<Category> getCategories() {

    List<Category> categories = new ArrayList<>();
    categories.add(new Category("programming", "Programing"));
    categories.add(new Category("bot", "Bot"));
    categories.add(new Category("funny", "Funny"));
    categories.add(new Category("science", "Science"));
    categories.add(new Category("others", "Others"));
    return categories;

}
    public Category(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}