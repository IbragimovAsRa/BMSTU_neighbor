package neighborApp.models;


import javax.persistence.*;

@Entity
public class Post {
    @Id
    @GeneratedValue
    private int id;

    private String username;

    private String location;

    private int price;

    private String description;

    public Post(String username, String location, int price, String description) {
        super();

        this.username = username;
        this.location = location;
        this.price = price;
        this.description = description;
    }
    public Post(){
        super();

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Posts{" +
                "location='" + location + '\'' +
                '}';
    }

}
