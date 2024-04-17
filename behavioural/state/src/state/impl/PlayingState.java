package state.impl;

import media.Song;
import state.State;

public class PlayingState implements State {
    private media.MediaPlayer mediaPlayer;

    public PlayingState(media.MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    @Override
    public void play(Song song) {
        System.out.println("Song is already playing.");
    }

    @Override
    public void pause(Song song) {
        song.pause();
        mediaPlayer.setState(new PausedState(mediaPlayer));
    }

    @Override
    public void stop(Song song) {
        song.stop();
        mediaPlayer.setState(new StoppedState(mediaPlayer));
    }
}
