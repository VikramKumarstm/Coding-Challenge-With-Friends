package Day05;

import java.util.ArrayList;
import java.util.Random;

public class MusicLibrary {

    ArrayList<String> songs = new ArrayList<String>();

        public void addSong(String song) {
            songs.add(song);
        }

        public void deleteSong(String song) {
            songs.remove(song);
        }

        public void displaySong() {
            for(String s : songs) {
                System.out.println(s);
            }
        }

        public void randomSongPlaying() {
            int size = songs.size();

            if(size == 0) {
                System.out.println("No song in the library");
            }

            Random randomNum = new Random();

            int index = randomNum.nextInt(size);

            System.out.println("Song is Playing : "+ songs.get(index));
        }
    public static void main(String[] args) {
        MusicLibrary ml = new MusicLibrary();

        ml.addSong("barsat ke mausam me");
        ml.addSong("Mere dil me nhi hai koi");
        ml.addSong("Tujhe dekha to ye janam");
        ml.addSong("Ho gaya hai tujhko to pyar sajna");
        ml.addSong("Kaune disha me leke chala re batohiya");

        System.out.println();
        System.out.println("All songs :");
        ml.displaySong();

        System.out.println();
        System.out.println("After removing song......");
        ml.deleteSong("barsat ke mausam me");
        ml.displaySong();

        System.out.println();
        System.out.println("Play random song :");
        ml.randomSongPlaying();
    }
}
