package CiNajlepsi.Gifs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Agnieszka on 23.07.2019.
 */
@Controller
public class GifController {

    @GetMapping("/")
    public String home() {

        return "home";
    }
}
