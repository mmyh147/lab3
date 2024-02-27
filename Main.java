//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

                Book book1 = new Book("Java Programming", "Ali", "ISBN123", 29.99, 0);
                Book book2 = new Book("Data Structures", "Sara", "ISBN456", 24.99, 5);

                Review review1 = new Review("user1", 4.5, "Great book!");
                Review review2 = new Review("user2", 5.0, "Excellent content!");
                book1.addReview(review1);
                book1.addReview(review2);

                Academic academicBook1 = new Academic("Math", "Prof. Ahmed", "ISBN789", 39.99, 0, "Mathematics");
        Academic academicBook2 = new Academic("Physics", "Dr. Saad", "ISBN101", 44.99, 0, "Physics");



                User user1 = new User("user123", "user123@gmail.com");
                User user2 = new User("user456", "user456@gmail.com");

        Review academicReview1 = new Review(user1.getUsername(), 4.8, "Very informative!");
        Review academicReview2 = new Review(user2.getUsername(), 4.2, "Well-written");
        academicBook1.addReview(academicReview1);
        academicBook1.addReview(academicReview2);


                Store store = new Store();
                store.addUser(user1);
                store.addUser(user2);
                store.addMedia(book1);
                store.addMedia(book2);
                store.addMedia(academicBook1);
                store.addMedia(academicBook2);
                store.displayUsers();
                System.out.println("Available Medias in the Store:");
                store.displayMedias();

                user1.addToCart(book1);
                user1.addToCart(academicBook1);
                user2.addToCart(book2);

                user1.removeFromCart(book1);

                user1.checkout();
                user2.checkout();

                System.out.println("\nPurchased Media for User 1:");
                for (Media media : user1.getPurchasedMediaList()) {
                    System.out.println("- " + media.getTitle());
                }

                System.out.println("\nPurchased Media for User 2:");
                for (Media media : user2.getPurchasedMediaList()) {
                    System.out.println("- " + media.getTitle());
                }


        Music music1 = new Music("Music 1", "ali A", "ISBNM001", 12.99);
        Music music2 = new Music("Music 2", "fatima B", "ISBNM002", 8.99);
        Movie movie1 = new Movie("Action Movie", "Sami", "ISBNMOV001", 19.99, 150);
        Movie movie2 = new Movie("Comedy Movie", "Mohammed", "ISBNMOV002", 14.99, 90);


        store.addMedia(music1);
        store.addMedia(music2);
        store.addMedia(movie1);
        store.addMedia(movie2);

        music1.listen(user1);
        movie2.watch(user1);
        user1.checkout();


            }
        }

