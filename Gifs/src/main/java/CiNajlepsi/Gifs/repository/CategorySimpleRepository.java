package CiNajlepsi.Gifs.repository;

import CiNajlepsi.Gifs.model.Category;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CategorySimpleRepository implements CategoryRepository {

    @Override
    public Category getCategoryById(int id) {
        return Category.getCategories().stream().filter(category -> category.getId()==id).collect(Collectors.toList()).get(0);
    }
}
