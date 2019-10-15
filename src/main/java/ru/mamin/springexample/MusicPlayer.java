package ru.mamin.springexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by AHYC on 09.10.2019.
 */
@Component
@Scope("prototype")
public class MusicPlayer {
    //name and volume from musicPlayer.properties
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    private static int id;

    public static int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    private Music classicalMusic;
    private Music rockMusic;
    private MusicGenre genre = (Math.random() * 2) > 1 ? MusicGenre.ROCK : MusicGenre.CLASSIC;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music classicalMusic,
                       @Qualifier("rockMusic") Music rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.id++;
    }

    public String playMusic(){
        String song = "";
        switch (genre) {
            case CLASSIC: song = "Playing classic: " + classicalMusic.getSong();
                break;
            case ROCK: song = "Playing rock: " + rockMusic.getSong();
                break;
        }
        return song;
    }


}
