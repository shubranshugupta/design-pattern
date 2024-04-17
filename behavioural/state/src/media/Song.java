package media;

public class Song {
    private String name;
    private String artist;
    private String album;

    public Song(String name, String artist, String album, int duration) {
        this.name = name;
        this.artist = artist;
        this.album = album;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    public void play() {
        System.out.println("Song is playing.");
    }

    public void pause() {
        System.out.println("Song is paused.");
    }

    public void stop() {
        System.out.println("Song is stopped.");
    }

    @Override
    public String toString() {
        return "Song [name=" + name + ", artist=" + artist + ", album=" + album + "]";
    }
}
