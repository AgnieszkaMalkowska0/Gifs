package CiNajlepsi.Gifs.controller;

import CiNajlepsi.Gifs.repository.GifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Agnieszka on 23.07.2019.
 */
//Karol Commit bla bla bla
@Controller
public class GifController {

    @Autowired
    private GifRepository gifRepository;

    @GetMapping("/")
    public String home(ModelMap map) {
        map.put("gifs", gifRepository.getGifs());
        return "home";
    }

    @GetMapping("/favorites")
    public String favorites(ModelMap map) {
        map.put("gifs", gifRepository.getFavorites());
        return "favorites";
    }

}

/*
    @GetMapping("/categories")
    public String categories(){
        return "categories";
    }

}
*/
