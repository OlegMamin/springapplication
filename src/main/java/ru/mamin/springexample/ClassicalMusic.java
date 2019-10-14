package ru.mamin.springexample;

/**
 * Created by AHYC on 09.10.2019.
 */
public class ClassicalMusic implements Music {
    public void doMyInit() {
        System.out.println("*** Classical music initialization method is running");
    }
    public void doMyDestroy() {
        System.out.println("*** Classical music DESTROY method is running");
    }

    @Override
    public String getSong() {
        return "Swan lake";
    }
}
