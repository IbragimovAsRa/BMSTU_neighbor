package neighborApp.dataModels;

import javax.persistence.*;

@Entity
public class Roles {
    @Id
    @GeneratedValue

    private long id;
    @Enumerated(EnumType.STRING)
    private ERoles name;

    public Roles() {}

    public Roles(ERoles name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ERoles getName() {
        return name;
    }

    public void setName(ERoles name) {
        this.name = name;
    }
}
