import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collections;

public class PlayList {
    private String name;
    private LinkedList<Track> list;
    private static ArrayList<String> nameDatabase = new ArrayList<String>();

    public PlayList() {
        this("My Playlist");
    }

    public PlayList(String playListName) {
        String copy = playListName;
        if (nameDatabase.indexOf(copy) != -1) {
            copy = playListName + " #" + (int)(Math.random() * 10000000); //Give playlist very unique name

            while (nameDatabase.indexOf(copy) != -1) {
                copy = playListName + " #" + (int)(Math.random() * 10000000);
            }
        }
        list = new LinkedList<Track>();
        nameDatabase.add(copy);
        this.name = copy;
    }

    public void setName(String name) {
        String copy = name;
        nameDatabase.remove(this.name);
        if (nameDatabase.indexOf(name) != -1) {
            copy = name + " #" + (int)(Math.random() * 10000000); //Give playlist very unique name
            while (nameDatabase.indexOf(copy) != -1) {
                copy = name + " #" + (int)(Math.random() * 10000000);
            }
        } 
        nameDatabase.add(copy);
        this.name = copy;
    }

    public String getName() {
        return this.name;
    }

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
        if (list.size() == 0) {
            System.out.println("The list is empty");
        }
        
        else {
            System.out.println(this.toString().substring(this.toString().indexOf('\n') + 1));
        }
    }

    public void playAll(boolean random) {
        LinkedList<Track> copy = list;
        if (random) {
            copy = new LinkedList<Track>(list);
            Collections.shuffle(copy);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Now playing:\n");
        for (int i = 0; i < copy.size(); i++) {
            sb.append(copy.get(i).toString());
            if (i == 1) { //after printing first song, we now say the rest are in queue
                sb.append("\nIn Queue:\n");
            }
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