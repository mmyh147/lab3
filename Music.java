import java.util.List;

public class Music extends Media {
    private String artist;

    public Music(String title, String artist, String ISBN, double price) {
        super(title, artist, ISBN, price);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void listen(User user) {
        user.setOneItem(this);//fix this
        System.out.println("Added '" + getTitle() + "' by " + getArtist() + " to the cart for listening.");
    }

    public void generatePlaylist(List<Music> musicCatalog) {
        System.out.println("Generated playlist of similar songs based on artist (" + getArtist() + "):");
        for (Music music : musicCatalog) {
            if (!getTitle().equals(music.getTitle()) && getArtist().equals(music.getArtist())) {
                System.out.println("- " + music.getTitle());
            }
        }
    }

    @Override
    public String getMediaType() {
        return (getPrice() >= 10) ? "Premium Music" : "Music";
    }

    @Override
    public String toString() {
        return getMediaType() + ": " + getTitle() + " by " + getArtist();
    }
}
