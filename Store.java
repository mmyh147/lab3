import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<User> users;
    private List<Media> availableMedias;

    public Store() {
        this.users = new ArrayList<>();
        this.availableMedias = new ArrayList<>();
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Media> getAvailableMedias() {
        return availableMedias;
    }

    public void setAvailableMedias(List<Media> availableMedias) {
        this.availableMedias = availableMedias;
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println("User '" + user.getUsername() + "' added to the store.");
    }

    public void displayUsers() {
        System.out.println("Registered Users:");
        for (User user : users) {
            System.out.println("- " + user.getUsername());
        }
    }

    public void addMedia(Media media) {
        availableMedias.add(media);
        System.out.println("Added " + media.getMediaType() + " '" + media.getTitle() + "' to available medias.");
    }

    public void displayMedias() {
        System.out.println("Available Medias:");
        for (Media media : availableMedias) {
            System.out.println("- " + media.getMediaType() + ": " + media.getTitle());
        }
    }

    public Book searchBook(String title) {
        for (Media media : availableMedias) {
            if (media instanceof Book && media.getTitle().equalsIgnoreCase(title)) {
                return (Book) media;
            }
        }
        return null;
    }
}
