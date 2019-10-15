package ru.mamin.springexample;

import org.springframework.stereotype.Component;

/**
 * Created by AHYC on 09.10.2019.
 */
@Component
public class RapMusic implements Music {

    @Override
    public String getSong() {
        return "This is America";
    }
}
