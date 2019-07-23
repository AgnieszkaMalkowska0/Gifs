package CiNajlepsi.Gifs.repository;

import CiNajlepsi.Gifs.controller.Gif;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class GifSimpleRepository implements GifRepository {
    @Override
    public List<Gif> getGifs() {
        List<Gif> gifs = new ArrayList<>();
        gifs.add(new Gif("android-explosion",true));
        gifs.add(new Gif("ben-and-mike"));
        gifs.add(new Gif("book-dominos",true));
        gifs.add(new Gif("compiler-bot"));
        gifs.add(new Gif("cowboy-coder",true));
        gifs.add(new Gif("infinite-andrew",true));
        return gifs;
    }

    @Override
    public List<Gif> getFavorites() {
        return getGifs().stream().filter(gif -> gif.getFavorite()).
                collect(Collectors.toList());
    }
}
