package com.teamtreehouse.giflib.data;

import com.teamtreehouse.giflib.model.Gif;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class GifRepository {
    private static final List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("India", 1, "India", false, "Hindi, English, Bengali", "1,324,171,354", "New Delhi"),
            new Gif("Spain", 2, "Spain", true, "Spanish", "46,378,298", "Madrid"),
            new Gif("Brazil", 3,"Brazil", false, "Portuguese", "210,178,978", "Brasilia"),
            new Gif("United Kingdom", 3, "United Kingdom", true, "English", "66,401,056", "London"),
            new Gif("China", 1, "China", false, "Mandarin", "1,412,616,405", "Beijing"),
            new Gif("Australia", 2, "Australia", true, "English", "24,629,183", "Canberra")
    );

    public Gif findByName(String name) {
        for(Gif gif : ALL_GIFS) {
            if(gif.getName().equals(name)) {
                return gif;
            }
        }
        return null;
    }

    public List<Gif> getAllGifs() {
        return ALL_GIFS;
    }

    public List<Gif> findByCategoryId(int id) {
        List<Gif> gifs = new ArrayList<>();
        for(Gif gif : ALL_GIFS) {
            if(gif.getCategoryId() == id) {
                gifs.add(gif);
            }
        }
        return gifs;
    }
}

