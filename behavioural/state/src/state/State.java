package state;

import media.Song;

public interface State {
    public void play(Song song);

    public void pause(Song song);

    public void stop(Song song);
}
