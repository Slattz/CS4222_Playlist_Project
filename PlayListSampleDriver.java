public class PlayListSampleDriver {
    public static void main(String[] args) {
        PlayList myFavourites = new PlayList();
        myFavourites.add("Like a Rolling Stone","Bob Dylan");
        myFavourites.add("(I Can't Get No) Satisfaction","The Rolling Stones",1965,197);
        myFavourites.add("Imagine", "John Lennon", 1971, 215);
        myFavourites.add("What's Going On", "Marvin Gaye");
        myFavourites.add("Respect", "Aretha Franklin");
        myFavourites.add("Good Vibrations", "Some Artist");
        myFavourites.add("Hey Jude", "The Beatles", 1968, 347);
        myFavourites.add("Smells Like Teen Spirit", "Nirvana");
        myFavourites.add("What'd I Say", "Ray Charles");
        myFavourites.add("The Long and Winding Road", "The Beatles");
        myFavourites.add("The Times They are a Changin'","Bob Dylan");
        myFavourites.add("Yellow Submarine", "The Beatles", 1967, 235);
        System.out.println();
        myFavourites.showList();
        System.out.println();
        myFavourites.playAll(false);
        System.out.println();
        System.out.println();
        myFavourites.playAll(true);
        System.out.println();
        myFavourites.playOnly("Beatles");
        System.out.println();
        myFavourites.playOnly(1971);
        myFavourites.remove("WHAT'D I SAY");
        myFavourites.showList();

        PlayList test1 = new PlayList("Test");
        PlayList test2 = new PlayList("Test");

        //use playlists with same name as parameter to show names are unique, then change name using setName
        System.out.println(test1.getName());
        System.out.println(test2.getName());
        System.out.println();
        test2.setName("This is a new name");
        System.out.println(test2.getName());
    }
}