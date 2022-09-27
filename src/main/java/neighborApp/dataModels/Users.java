package neighborApp.dataModels;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Users {
    @Id
    @GeneratedValue
    private int id;
    private String login;
    private  String mail;
    private String password;

    public Users(int id, String login, String mail, String password) {
        this.id = id;
        this.login = login;
        this.mail = mail;
        this.password = password;
    }
}
