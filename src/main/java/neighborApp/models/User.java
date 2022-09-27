package neighborApp.models;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users", uniqueConstraints =
                {@UniqueConstraint(columnNames = "login"),
                @UniqueConstraint(columnNames = "mail")})
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String login;
    private  String mail;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns= @JoinColumn(name = "role_id"))

    private Set<Role> roles = new HashSet<>();

    public User(String login, String mail, String password) {
        this.login = login;
        this.mail = mail;
        this.password = password;
    }

    public User() {}

}
