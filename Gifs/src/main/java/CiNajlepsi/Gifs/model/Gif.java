package CiNajlepsi.Gifs.model;

public class Gif {
    private String name;

    public Gif(String name) {
        this.name = name;
    }

    public String getUrl() {
        return "gifs/" + name + ".gif";
    }
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private boolean favorite;
    public Gif(String name, boolean favorite){
        this.name=name;
        this.favorite=favorite;
    }

    public boolean getFavorite(){
        return favorite;
    }
}

