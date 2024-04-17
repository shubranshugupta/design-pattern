package state.impl;

import media.Song;
import state.State;

public class PausedState implements State {
    private media.MediaPlayer mediaPlayer;

    public PausedState(media.MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    @Override
    public void play(Song song) {
        song.play();
        mediaPlayer.setState(new PlayingState(mediaPlayer));
    }

    @Override
    public void pause(Song song) {
        System.out.println("Song is already paused.");
    }

    @Override
    public void stop(Song song) {
        song.stop();
        mediaPlayer.setState(new StoppedState(mediaPlayer));
    }
}
