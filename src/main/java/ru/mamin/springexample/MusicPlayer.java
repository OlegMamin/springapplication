package ru.mamin.springexample;

import java.util.List;

/**
 * Created by AHYC on 09.10.2019.
 */
public class MusicPlayer {
    private List<Music> musicList;
    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    // Inversion Of Control
    public MusicPlayer (List<Music> music){
        this.musicList = music;
    }

    public MusicPlayer() {
    }

    public void setMusicList(List<Music> music) {
        this.musicList = music;
    }

    public void playMusic() {
        for (Music m : musicList) {
            System.out.println("Playing song: " + m.getSong());
        }
    }
    public void doInit(){
        System.out.println("+++Player init method");
    }
    public void doDestroy(){
        System.out.println("+++Player init method");
    }
}
