import java.util.List;

public class Movie extends Media {
    private int duration;  // in minutes

    public Movie(String title, String director, String ISBN, double price, int duration) {
        super(title, director, ISBN, price);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    //Check this method
    public void watch(User user) {
        user.setOneItem(this);
        System.out.println("Added '" + getTitle() + "' to the cart for watching.");
    }

    public void recommendSimilarMovies(List<Movie> movieCatalog) {
        System.out.println("Recommended similar movies based on director (" + getAuteur() + "):");
        for (Movie movie : movieCatalog) {
            if (!getTitle().equals(movie.getTitle()) && getAuteur().equals(movie.getAuteur())) {
                System.out.println("- " + movie.getTitle());
            }
        }
    }

    @Override
    public String getMediaType() {
        return (duration >= 120) ? "Long Movie" : "Movie";
    }

    @Override
    public String toString() {
        return getMediaType() + ": " + getTitle() + " directed by " + getAuteur();
    }
}

