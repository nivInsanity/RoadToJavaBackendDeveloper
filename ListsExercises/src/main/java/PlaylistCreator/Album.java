package PlaylistCreator;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) != null) {
            return false;
        } else {
            return songs.add(new Song(title, duration));
        }
    }

    private Song findSong(String title) {
        for (Song song : songs) {
            if (song.getTitle().equals(title)) {
                return song;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        if (trackNumber <= 0 || trackNumber > songs.size()) {
            return false;
        }
        return playlist.add(songs.get(trackNumber - 1));
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        if (findSong(title) != null) {
            return playlist.add(new Song(title, 0));
        } else {
            return false;
        }
    }
}
