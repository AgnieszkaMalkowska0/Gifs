package CiNajlepsi.Gifs.controller;

import CiNajlepsi.Gifs.repository.CategoryRepository;
import CiNajlepsi.Gifs.repository.GifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import CiNajlepsi.Gifs.model.Category;
import org.springframework.web.bind.annotation.PathVariable;


/**
 * Created by CiNajlepsi Company on 23.07.2019.
 */
@Controller
public class CategoryController {

    @Autowired
    private GifRepository gifRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("/categories")
    public String index(ModelMap map) {
        map.put("categories", Category.getCategories());
        return "categories";
    }

    @GetMapping("/category/{id}")
    public String show(@PathVariable Integer id, ModelMap map) {
        map.put("gifs", gifRepository.getGifsByCategoryId(id));
        map.put("category", categoryRepository.getCategoryById(id));
        return "category";
    }
}
