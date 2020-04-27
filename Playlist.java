import java.util.LinkedList;
import java.util.Collections;

public class PlayList {
    private String name;
    private LinkedList<Track> list;

    public PlayList() {
        this("My Playlist");
    }

    public PlayList(String playListName) {
        list = new LinkedList<Track>();
        this.name = playListName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    // Make pretty later
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Playlist Name: " + name + "\n\n");
        for (Track track : list) {
            sb.append(track.toString() + '\n');
        }
        return sb.toString();
    }

    public void add(String title, String artist) {
        Track track = new Track(title, artist);
        list.add(track);
    }

    public void add(String title, String artist, int year, int duration) {
        Track track = new Track(title, artist, year, duration);
        list.add(track);
    }

    public void add(Track t) {
        list.add(t);
    }

    public boolean remove(String title) {
        for (Track track : list) {
            if (track.getTitle().compareToIgnoreCase(title) == 0) {
                list.remove(track);
                return true;
            }
        }
        return false;
    }

    public void showList() {
        System.out.println(this.toString().substring(this.toString().indexOf('\n') + 1));
    }

    public void playAll(boolean random) {
        LinkedList<Track> lol = list;
        if (random) {
            lol = new LinkedList<Track>(list);
            Collections.shuffle(lol);
        }

        StringBuilder sb = new StringBuilder();
        for (Track track : lol) {
            sb.append(track.toString());
        }
        System.out.println(sb.toString());
    }

    public void playOnly(String artist) {
        StringBuilder sb = new StringBuilder();
        for (Track track : list) {
            if (track.getArtist().compareToIgnoreCase(artist) == 0) {
                sb.append(track.toString());
            }
        }
        System.out.println(sb.toString());
    }

    public void playOnly(int year) {
        StringBuilder sb = new StringBuilder();
        for (Track track : list) {
            if (track.getYear() == year) {
                sb.append(track.toString());
            }
        }
        System.out.println(sb.toString());
    }
}