package ru.mamin.springexample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by AHYC on 08.10.2019.
 */
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

//        Music music = context.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);

        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer1 == musicPlayer2);

        musicPlayer1.setVolume(11);
        System.out.println(musicPlayer2.getVolume());
        System.out.println("--------");

        musicPlayer1.playMusic();
        System.out.println(musicPlayer1.getName());
        System.out.println(musicPlayer1.getVolume());

        context.close();
    }
}
