public class SongFinder
{
    public static int findTitle(Song[] songs, String target){
        for (int i = 0; i < songs.length; i++){

            String word = songs[i].getTitle();
            if (word.equals(target)) {
                return i;
            }
            else return -1;
        }
        return -1;
    }
    public static int getIndexLastDiscount(Song[] songs, double compare){
        if (songs == null) return -1;

        int found = -1;
        for (int i = songs.length - 1; i >=0; i--) {
            if (songs[i].getPrice() < compare) {
                found = i;
            }
            else {
                found = -1; // to show none found
            }
        }
        return found;
    }
}