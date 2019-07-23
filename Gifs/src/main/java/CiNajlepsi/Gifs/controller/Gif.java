package CiNajlepsi.Gifs.controller;

import java.util.ArrayList;
import java.util.List;

public class Gif {
    private String name;
    public Gif(String name) {
        this.name = name;
    }
    public String getUrl(){
        return "gifs/" + name + ".gif";
    }
    public void setName(String name) {
        this.name = name;
    }
    public static List<Gif> getGifs(){
        List<Gif> gifs = new ArrayList<>();
        gifs.add(new Gif("android-explosion"));
        gifs.add(new Gif("ben-and-mike"));
        gifs.add(new Gif("book-dominos"));
        gifs.add(new Gif("compiler-bot"));
        gifs.add(new Gif("cowboy-coder"));
        gifs.add(new Gif("infinite-andrew"));
        return gifs;
    }
}
