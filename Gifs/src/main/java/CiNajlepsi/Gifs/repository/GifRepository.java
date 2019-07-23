package CiNajlepsi.Gifs.repository;

import CiNajlepsi.Gifs.controller.Gif;

import java.util.List;

public interface GifRepository {
    List<Gif> getGifs();
    List<Gif> getFavorites();
}
