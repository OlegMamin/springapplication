package ru.mamin.springexample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Collection;

/**
 * Created by AHYC on 08.10.2019.
 */
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Computer computer1 = context.getBean("computer", Computer.class);
        System.out.println(computer1);
        Computer computer2 = context.getBean("computer", Computer.class);
        System.out.println(computer2);
        //checking difference between computer1 and computer2
        System.out.println(computer1 == computer2);

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();
//        Music rockMusic = context.getBean("rockMusic", Music.class);
//        MusicPlayer rockPlayer = new MusicPlayer(rockMusic);
//        rockPlayer.playMusic();
//        Music rapMusic = context.getBean("rapMusic", Music.class);
//        MusicPlayer rapPlayer = new MusicPlayer(rapMusic);
//        rapPlayer.playMusic();

//        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
//
//        System.out.println(musicPlayer1 == musicPlayer2);
//
//        musicPlayer1.setVolume(11);
//        System.out.println(musicPlayer2.getVolume());
//        System.out.println("--------");
//
//        musicPlayer1.playMusic();
//        System.out.println(musicPlayer1.getName());
//        System.out.println(musicPlayer1.getVolume());

        context.close();
    }
}
