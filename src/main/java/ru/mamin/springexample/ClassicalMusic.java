package ru.mamin.springexample;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by AHYC on 09.10.2019.
 */
@Component
public class ClassicalMusic implements Music {
    private String[] songs = {"Swan Lake", "Schelkunchick", "6th Symphony"};
    @PostConstruct
    public void doMyInit() {
        System.out.println("*** Classical music initialization method is running");
    }
    @PreDestroy
    public void doMyDestroy() {
        System.out.println("*** Classical music DESTROY method is running");
    }

    @Override
    public String getSong() {
        return songs[(int)(Math.random() * 3)];
    }
}
