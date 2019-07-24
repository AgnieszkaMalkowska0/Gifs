package CiNajlepsi.Gifs.repository;

import CiNajlepsi.Gifs.model.Gif;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class GifSimpleRepository implements GifRepository {
    @Override
    public List<Gif> getGifs() {
        List<Gif> gifs = new ArrayList<>();
        gifs.add(new Gif("android-explosion"));
        gifs.add(new Gif("ben-and-mike"));
        gifs.add(new Gif("book-dominos"));
        gifs.add(new Gif("compiler-bot"));
        gifs.add(new Gif("cowboy-coder"));
        gifs.add(new Gif("infinite-andrew"));
        gifs.add(new Gif("0e9b8ad60c9e93bd35fc86936fe9ad6c"));
        gifs.add(new Gif("0fcf654ee673329198a8e7c3d850edce"));
        gifs.add(new Gif("1d6c2e9832bb4098fbaf41bc0ee1c631"));
        gifs.add(new Gif("1f58edaf7fe6269cb2da7bb631465eb6"));
        gifs.add(new Gif("2_be72d196d892"));
        gifs.add(new Gif("8dbb99544d356c0fd28a75b3051d751d",true));
        gifs.add(new Gif("41a550b04035d34532bab108521908a7"));
        gifs.add(new Gif("107e1907c93e08b63c3c2a13983375e7",true));
        gifs.add(new Gif("567e8d486b0b831e0f659760109dff38"));
        gifs.add(new Gif("703d98a7f4d627145c709c65feb784e5"));
        gifs.add(new Gif("983c9600d54fa809ea2a003ff0fe1240"));
        gifs.add(new Gif("7899_e9f1",true));
        gifs.add(new Gif("8645ef40c73484137d2d71d3800cb864"));
        gifs.add(new Gif("17884-aa0cd1fb0ef8f475c6899d8877a74c9d"));
        gifs.add(new Gif("35854"));
        gifs.add(new Gif("b0d047a7333b6e3218410c58c1ea3be2",true));
        gifs.add(new Gif("be803f11ea31807a93bb9646ae73d4c9"));
        gifs.add(new Gif("bezNazwy16"));
        gifs.add(new Gif("cb14491cdc78ac97bf07d041c29ff6cb"));
        gifs.add(new Gif("d02a61070902deb0cb5a2e0860cc4cd2"));
        gifs.add(new Gif("d4c1e29c158016e675d8ec3cbe2b0024"));
        gifs.add(new Gif("Dlaczego nie było prądu w Szczecinie",true));
        gifs.add(new Gif("Dzieci NEO"));
        gifs.add(new Gif("gif"));
        gifs.add(new Gif("Hipersześcian"));
        gifs.add(new Gif("kaczka"));
        gifs.add(new Gif("mtzcN"));
        gifs.add(new Gif("Real Madryt"));
        gifs.add(new Gif("santa_1024x678"));
        gifs.add(new Gif("versus"));
        return gifs;
    }

    @Override
    public List<Gif> getFavorites() {
        return getGifs().stream().filter(gif -> gif.getFavorite()).
                collect(Collectors.toList());
    }
}
