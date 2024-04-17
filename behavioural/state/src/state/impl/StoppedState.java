package state.impl;

import media.Song;
import state.State;

public class StoppedState implements State {
    private media.MediaPlayer mediaPlayer;

    public StoppedState(media.MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    @Override
    public void play(Song song) {
        song.play();
        mediaPlayer.setState(new PlayingState(mediaPlayer));
    }

    @Override
    public void pause(Song song) {
        song.pause();
        mediaPlayer.setState(new PausedState(mediaPlayer));
    }

    @Override
    public void stop(Song song) {
        System.out.println("Song is already stopped.");
    }
}
