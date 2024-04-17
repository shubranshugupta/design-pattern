import media.MediaPlayer;
import media.Song;

public class MainClass {
    public static void main(String[] args) throws Exception {
        Song song = new Song("Name1", "Artist1", "Album1", 10);
        MediaPlayer mediaPlayer = new MediaPlayer(song);

        mediaPlayer.play();
        mediaPlayer.pause();
        mediaPlayer.play();
        mediaPlayer.stop();
        mediaPlayer.stop();
    }
}
