package homeworks.lecture16_collections.model;

public class Song implements Comparable<Song>{
    String title;
    String artist;
    String rating;
    String genre;

    public Song(String title, String artist, String rating, String genre) {
        this.title = title;
        this.artist = artist;
        this.rating = rating;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getRating() {
        return rating;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title: " + title +
                ", artist: " + artist +
                ", rating: " + rating +
                ", genre: " + genre +
                '}' + "\n";
    }

    @Override
    public int compareTo(Song song) {
        return title.compareTo(song.getTitle());
    }

    @Override
    public int hashCode(){
        return title.hashCode();
    }
}
