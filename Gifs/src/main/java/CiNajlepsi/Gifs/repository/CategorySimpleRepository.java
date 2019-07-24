package CiNajlepsi.Gifs.repository;

import CiNajlepsi.Gifs.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.stream.Collector;
import java.util.stream.Collectors;

@Component
public class CategorySimpleRepository implements CategoryRepository {

    @Override
    public Category getCategoryById(int id) {
        return Category.getCategories().stream().filter(category -> category.getId()==id).collect(Collectors.toList()).get(0);

    }
}
