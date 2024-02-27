import java.util.List;

public class Academic extends Book {
    private String subject;

    public Academic(String title, String author, String ISBN, double price, int stock, String subject) {
        super(title, author, ISBN, price, stock);
        this.subject = subject;
    }



    @Override
    public String getMediaType() {
        return (getAverageRating() >= 4.5) ? "Bestselling AcademicBook" : "AcademicBook";
    }

    @Override
    public String toString() {
        return getMediaType() + ": " + getTitle() + " by " + getAuteur() + ", Subject: " + subject;
    }
}
