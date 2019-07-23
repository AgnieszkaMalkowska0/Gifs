package CiNajlepsi.Gifs.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Agnieszka on 23.07.2019.
 */
public class Category {

    private Integer id;

    private String name;


public static List<Category> getCategories() {

    List<Category> categories = new ArrayList<>();
    categories.add(new Category(1, "programming"));
    categories.add(new Category(2, "bot"));
    categories.add(new Category(3, "others"));
    return categories;

}
    public Category(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}