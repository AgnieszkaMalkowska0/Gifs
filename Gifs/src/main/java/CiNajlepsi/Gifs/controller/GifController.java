package CiNajlepsi.Gifs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Agnieszka on 23.07.2019.
 */
//Karol Commit bla bla bla
@Controller
public class GifController {

    @GetMapping("/")

    public String home(ModelMap map) {
        map.put("gifs", Gif.getGifs());

        return "home";
    }
}

/*
    @GetMapping("/categories")
    public String categories(){
        return "categories";
    }


}
*/
