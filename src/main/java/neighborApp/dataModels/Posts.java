package neighborApp.dataModels;


import javax.persistence.*;

@Entity
public class Posts {
    @Id
    @GeneratedValue
    private int id;

    private String login;

    private String location;

    private int price;

    private String description;

    public Posts(String login, String location, int price, String description) {
        super();

        this.login = login;
        this.location = location;
        this.price = price;
        this.description = description;
    }
    public Posts(){
        super();

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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
