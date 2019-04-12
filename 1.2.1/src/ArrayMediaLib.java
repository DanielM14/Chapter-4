public class ArrayMediaLib {

    private static double Price;
    private static int i;

    public static void main(String args[]){

        String[] sharingFriends = {"Jamal",
                "Emily",
                "Destiny",
                "Mateo",
                "Sofia"
        };
        for (int i = 0; 1< sharingFriends.length; ++i){
            System.out.println(sharingFriends[i]);
        }

        int[] daysBtwnPurchase = {2, 5, 1, 2, 4, 2, 1, 3};

        int total = 0;
        int avg = 0;

        int[] arrayNum = {2, 2, 1, 3, 5, 4, 5, 3};

        for (i = 0; i < arrayNum.length; ++i){
            total = total + avg;
        }
        for (int val: daysBtwnPurchase) {
            total = total + val;
        }
        int count = 0;
        int arrayCount = 0;

        for (int i = 0; i < arrayCount; ++i)
            if(count + 3 == 0){
                Price = .99;
            } else
                Price = 1.29;
        ++count;

        Song[] topTenSongs = {new Song(),
                new Song("The Twist"),
                new Song("Smooth"),
                new Song("Mack the Knife"),
                new Song("How do I live"),
                new Song("Party Rock Anthem"),
                new Song("I Gotta Feeling"),
                new Song("I Gotta Feeling"),
                new Song("Put a Date On It"),
                new Song("You Light Up My Life"),
                new Song("Hey Jude")
        };
        for (Song s: topTenSongs)
        {
            System.out.println(s.getTitle());
        }
        System.out.println("-BEFORE-");
        for (Song changSong : topTenSongs){
            changSong.setTitle("Test");
        }
        System.out.println("-AFTER-");
        for (Song showSong : topTenSongs){
            System.out.println(showSong.getTitle());
        }
        int index = SongFinder.findTitle(topTenSongs, "Mack the Knife");
        if (index >=0 ) {
            System.out.println("Found " + topTenSongs[index].getTitle());
        }
        else  {
            System.out.println("Song not found!");
        }
        index = SongFinder.getIndexLastDiscount(topTenSongs, 1.00);
        if (index >= 0 ) {
            System.out.println("Discount found " + topTenSongs[index].getTitle());
        }
        else {
            System.out.println("No songs are discounted");
        }
    }
}
