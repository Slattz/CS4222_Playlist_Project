public class PlaylistDriver {
    public static void main(String args[]) {
        long time = System.currentTimeMillis();
        Playlist mixTape = new Playlist("mixtape");
        mixTape.add("Hello", "Pink Floyd", 1976, 200);
        mixTape.add("Crazy", "Queen", 1975, 201);
        mixTape.add("Little", "Pink Floyd", 1976, 202);
        mixTape.add("Thing", "Queen", 1975, 203);
        mixTape.add("Called", "Pink Floyd", 1976, 204);
        mixTape.add("Love", "Queen", 1975, 205);
        mixTape.add("Wow", "Pink Floyd", 1975, 206);
        mixTape.add("Insane", "Queen", 1976, 207);
        System.out.println("\nPlay mixtape in sequence:");
        mixTape.play(false);
        System.out.println("\nPlay mixtape in shuffle:");
        mixTape.play(true);
        System.out.println("\nPlay mixtape in sequence:");
        mixTape.play(false);
        System.out.println("\nPlay only songs from 1976 from mixtape:");
        mixTape.playOnly(1976);
        System.out.println("\nPlay only songs by Queen from mixtape:");
        mixTape.playOnly("Queen");
        mixTape.remove("love");
        System.out.println("\nShow mixtape with 'Love' track removed");
        mixTape.play(false);
        System.out.print("ececuted in " + (System.currentTimeMillis() - time) + " ms");
    }
}

