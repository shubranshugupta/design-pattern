package media;

import state.State;
import state.impl.StoppedState;

public class MediaPlayer {
    private Song song;
    private State state;

    public MediaPlayer(Song song) {
        this.song = song;
        this.state = new StoppedState(this);
    }

    public void play() {
        state.play(song);
    }

    public void pause() {
        state.pause(song);
    }

    public void stop() {
        state.stop(song);
    }

    public void setState(State state) {
        this.state = state;
    }

    public Song getSong() {
        return song;
    }
}
