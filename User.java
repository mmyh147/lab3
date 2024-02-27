import java.util.ArrayList;

public class User {

    private String username, email;
    private ArrayList <Media> purchasedMediaList = new ArrayList<Media>();
    private ArrayList <Media> shoppingCart = new ArrayList<Media>();

    public User(String username, String email) {
        this.username = username;
        this.email = email;
        this.purchasedMediaList = purchasedMediaList;
        this.shoppingCart = shoppingCart;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Media> getPurchasedMediaList() {
        return purchasedMediaList;
    }

    public void setPurchasedMediaList(ArrayList<Media> purchasedMediaList) {
        this.purchasedMediaList = purchasedMediaList;
    }

    public ArrayList<Media> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ArrayList<Media> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void setOneItem(Media media){
        this.shoppingCart.add(media);

    }

    public void addToCart(Media media){
        Book book = (Book) media;
        book.purchase(this);
    //    shoppingCart.add(media);
        System.out.println("'" + media.getTitle() + "' added to the cart.");
    }
    public void removeFromCart(Media media){
        shoppingCart.remove(media);
    }

    public void checkout(){
        purchasedMediaList.addAll(shoppingCart);
        shoppingCart.clear();
    }
}
