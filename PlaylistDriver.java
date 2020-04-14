public class PlaylistDriver {
    public static void main(String args[]) {
        long time = System.currentTimeMillis();
        Playlist Bop = new Playlist("Muddy Puddles 2020");
        Bop.add("Bing Bong Zoo", "Peppa Pig", 2019, 191);
        Bop.add("Jumping In Muddy Puddles", "Queen Peppa ;)", 2019, 171);
        Bop.add("Expert Daddy Pig", "Daddy Pig", 2019, 170);
        Bop.add("Super Potato's Theme", "Peppa Pig", 2019, 116);
        Bop.add("Super Bass", "Nicki Minaj", 2011, 200);
        Bop.add("Starships", "Nicki Minaj", 2011, 210);
        Bop.add("Cotton Eye Joe", "Rednex", 1994, 194);
        Bop.add("Chun-Li", "Nicki Minaj", 2018, 191);
        System.out.println("\nPlay Bop in sequence:");
        Bop.play(false);
        System.out.println("\nPlay Bop in shuffle:");
        Bop.play(true);
        System.out.println("\nPlay Bop in sequence again:");
        Bop.play(false);
        System.out.println("\nPlay only songs from 2019 from Bop:");
        Bop.playOnly(2019);
        System.out.println("\nPlay only songs by Nicki Minaj from Bop:");
        Bop.playOnly("Nicki Minaj");
        Bop.remove("Bing Bong Zoo");
        System.out.println("\nShow Bop with 'Bing Bong Zoo' track removed");
        Bop.play(false);
        System.out.print("ececuted in " + (System.currentTimeMillis() - time) + " ms");
    }
}
