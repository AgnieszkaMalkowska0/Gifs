package CiNajlepsi.Gifs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import CiNajlepsi.Gifs.model.Category;


/**
 * Created by Agnieszka on 23.07.2019.
 */
@Controller
public class CategoryController {

    @GetMapping("/categories")
    public String index(ModelMap map) {
        map.put("categories", Category.getCategories());
        return  "categories";
    }


    }
