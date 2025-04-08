package PlaylistCreator;

import lombok.Getter;

public class Song {
    @Getter
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return title + ": " + duration;
    }
}
