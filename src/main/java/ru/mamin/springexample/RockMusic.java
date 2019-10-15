package ru.mamin.springexample;

import org.springframework.stereotype.Component;

/**
 * Created by AHYC on 09.10.2019.
 */
@Component
public class RockMusic implements Music{

    private String[] songs = {"Time is running out", "We will rock you", "Sad but true"};
    @Override
    public String getSong() {
        return songs[(int)(Math.random() * 3)];
    }
}
