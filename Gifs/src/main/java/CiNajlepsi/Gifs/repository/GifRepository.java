package CiNajlepsi.Gifs.repository;

import CiNajlepsi.Gifs.model.Gif;

import java.util.List;

public interface GifRepository {
    List<Gif> getGifs();
    List<Gif> getFavorites();
    List<Gif> getGifsByCategoryId(int id);
    Gif findByName(String name);
}
