package CiNajlepsi.Gifs.repository;

import CiNajlepsi.Gifs.model.Gif;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public  class GifSimpleRepository implements GifRepository{
    @Override
    public List<Gif> getGifs() {
        List<Gif> gifs = new ArrayList<>();
        gifs.add(new Gif("android-explosion",false, 1));
        gifs.add(new Gif("ben-and-mike",true,2));
        gifs.add(new Gif("book-dominos",true,3));
        gifs.add(new Gif("compiler-bot",true,2));
        gifs.add(new Gif("cowboy-coder",false,1));
        gifs.add(new Gif("infinite-andrew",true,1));
        gifs.add(new Gif("0e9b8ad60c9e93bd35fc86936fe9ad6c",false,2));
        return gifs;
    }

    @Override
    public List<Gif> getFavorites() {
        return getGifs().stream().filter(gif -> gif.getFavorite()).
                collect(Collectors.toList());
    }
    @Override
    public List<Gif> getGifsByCategoryId(int id) {
        return getGifs().stream().filter(gif -> gif.getCategoryId()==id).collect(Collectors.toList());
    }

    @Override
    public Gif findByName (String name){
        return getGifs().stream().filter(gif -> gif.getName().equals(name)).collect(Collectors.toList()).get(0);
    }
}
