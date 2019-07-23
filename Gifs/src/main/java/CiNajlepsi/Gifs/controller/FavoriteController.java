package CiNajlepsi.Gifs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FavoriteController {
    @GetMapping("/favorites")
    public String index(ModelMap map) {
        map.put("gifs", Gif.getFavorites());
        return "favorites";
    }
}
