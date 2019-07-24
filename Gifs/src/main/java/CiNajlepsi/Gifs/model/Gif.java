package CiNajlepsi.Gifs.model;

public class Gif {
    private String name;

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public Gif(int categoryId) {
        this.categoryId = categoryId;
    }

    private int categoryId;

    public Gif(String name) {
        this.name = name;
    }

    public String getUrl() {
        return "/gifs/" + name + ".gif";
    }
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private boolean favorite;
    public Gif(String name, boolean favorite,int categoryId){
        this.name=name;
        this.favorite=favorite;
        this.categoryId=categoryId;
    }

    public boolean getFavorite(){
        return favorite;
    }


    public Gif(String name, int categoryId) {
        this.name = name;
        this.categoryId = categoryId;
    }
    public String getDetailsUrl(){
        return "/gif/"+name;
    }
}

