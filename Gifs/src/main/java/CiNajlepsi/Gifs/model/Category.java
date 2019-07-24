package CiNajlepsi.Gifs.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CiNajlepsi Company on 23.07.2019.
 */
public class Category {

    private int id;

    private String name;

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public static List<Category> getCategories() {

        List<Category> categories = new ArrayList<>();
        categories.add(new Category(1, "Programing"));
        categories.add(new Category(2, "Bot"));
        categories.add(new Category(3, "Funny"));
        categories.add(new Category(4, "Science"));
        categories.add(new Category(5, "Others"));
        return categories;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
