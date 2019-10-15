package ru.mamin.springexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by AHYC on 14.10.2019.
 */
@Component
@Scope("prototype")
public class Computer {
    private static int id;
    private MusicPlayer musicPlayer;

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
        this.id++;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", " + musicPlayer.playMusic() +
                '}' + "\nPlayer: " + musicPlayer.getName() +
                ", volume: " + musicPlayer.getVolume() +
                ", id: " + musicPlayer.getId();
    }
}
