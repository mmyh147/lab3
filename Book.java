import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
    private int stock;
    private List<Review> reviews;


    public Book(){

    }
    public Book(String title, String auteur, String ISBN, double price, int stock) {
        super(title, auteur, ISBN, price);
        this.stock = stock;
        this.reviews = new ArrayList<>();
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }



    public void addReview(Review review){
        this.reviews.add(review);
        System.out.println("Review added for '" + getTitle() + "'.");
    }

    public double getAverageRating() {
        if (reviews.isEmpty()) {
            return 0.0;
        }
        double sum = 0.0;
        for (Review review : reviews) {
            sum += review.getRating();
        }
        return sum / reviews.size();
    }

        public void purchase(User user) {
            if (stock > 0) {
                user.setOneItem(this);
                stock--;
                System.out.println("'" + getTitle() + "' added to the cart. Stock reduced to " + stock + ".");
            } else {
                System.out.println("Sorry, '" + getTitle() + "' is out of stock.");
            }
        }

        public boolean isBestseller() {
            return getAverageRating() >= 4.5;
        }

        public void restock(int quantity) {
            stock += quantity;
            System.out.println("'" + getTitle() + "' restocked. New stock: " + stock + ".");
        }

        @Override
        public String getMediaType() {
            return isBestseller() ? "Bestselling Book" : "Book";
        }

        @Override
        public String toString() {
            return getMediaType() + ": " + getTitle() + " by " + getAuteur();
        }





}
