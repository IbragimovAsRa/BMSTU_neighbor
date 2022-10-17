package net.api.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "posts")
@Data
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "users_id")
    private Long user_id;

    @Column(name = "location")
    private String location;
    @Column(name = "price")
    private int price;
    @Column(name = "description")
    private String description;
}
