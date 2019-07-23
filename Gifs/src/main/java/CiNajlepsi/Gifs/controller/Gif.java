package CiNajlepsi.Gifs.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Gif {
    private String name;

    public Gif(String name) {
        this.name = name;
    }

    public String getUrl() {
        return "gifs/" + name + ".gif";
    }

    public void setName(String name) {
        this.name = name;
    }

    public static List<Gif> getGifs() {
        List<Gif> gifs = new ArrayList<>();
        gifs.add(new Gif("android-explosion"));
        gifs.add(new Gif("ben-and-mike", true));
        gifs.add(new Gif("book-dominos", true));
        gifs.add(new Gif("compiler-bot"));
        gifs.add(new Gif("cowboy-coder"));
        gifs.add(new Gif("infinite-andrew", true));
        return gifs;
    }

    public static List<Gif> getFavorites() {
        return getGifs().stream().filter(gif -> gif.favorite).collect(Collectors.toList());
    }

    private boolean favorite;

    public Gif(String name, boolean favorite) {
        this.name = name;
        this.favorite = favorite;
    }

    public boolean getFavorite() {
        return favorite;
    }
}

