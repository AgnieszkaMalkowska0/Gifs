package CiNajlepsi.Gifs.controller;

import CiNajlepsi.Gifs.repository.GifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by CiNajlepsi Company on 23.07.2019.
 */

@Controller
public class GifController {

    @Autowired // gifRepository = new GifSimpleRepository, wie, że GifSimpleRepository bo przed nim jest @Component
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

    @GetMapping("/gif/{name}")
    public String getGif(@PathVariable String name, ModelMap map){
        map.put("gif",gifRepository.findByName(name));
        return "gif-details";
    }
}




