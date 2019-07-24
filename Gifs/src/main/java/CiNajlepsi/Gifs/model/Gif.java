package CiNajlepsi.Gifs.model;

public class Gif {
    private String name;
    private boolean favorite;
    private CategoriesEnum categoriesEnum;

    public CategoriesEnum getCategoriesEnum() {
        return categoriesEnum;
    }

    public void setCategoriesEnum(CategoriesEnum categoriesEnum) {
        this.categoriesEnum = categoriesEnum;
    }

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


    public Gif(String name, boolean favorite){
        this.name=name;
        this.favorite=favorite;
    }

    public Gif(String name, boolean favorite, CategoriesEnum categoriesEnum) {
        this.name = name;
        this.favorite = favorite;
        this.categoriesEnum = categoriesEnum;
    }

    public Gif(String name, CategoriesEnum categoriesEnum) {
        this.name = name;
        this.categoriesEnum = categoriesEnum;
    }

    public boolean getFavorite(){
        return favorite;
    }



}

