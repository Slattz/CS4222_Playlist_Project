import java.lang.Comparable;

public class Track implements Comparable<Track> {
    private String title;
    private String artist;
    private int year;
    private int duration;

    public Track(String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.year = 0;
        this.duration = 0;
    }

    public Track(String title, String artist, int year, int dur) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.duration = dur;
    }

    public void setTitle(String title) { // This allows the title to be changed
        this.title = title;
    }

    public String getTitle() { // This returns the current title
        return title;
    }

    public void setArtist(String artist) { // This allows the artist name to be changed
        this.artist = artist;
    }

    public String getArtist() { // This returns the current artist name
        return artist;
    }

    public void setYear(int year) { // This allows the year of release to be changed
        this.year = year;
    }

    public int getYear() { // This returns the current year of release
        return year;
    }

    public void setDuration(int seconds) { // This allows the track duration to be changed
        this.duration = seconds;
    }

    public int getDuration() { // This returns the current duration
        return duration;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("----------\nTitle: " + title + '\n');
        sb.append("Artist: " + artist + '\n');
        if (year != 0) {sb.append("Year: " + year + '\n');}
        if (duration != 0) {sb.append(String.format("%02d:%02d\n----------\n", duration/60, duration%60));}

        return sb.toString();
    }

    public int compareTo(Track track) {
        return this.title.compareToIgnoreCase(track.title);
    }
}