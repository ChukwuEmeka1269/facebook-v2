package com.example.facebookv2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String email;
    private String password;
    private String gender;
    @OneToMany
    private List<Post> posts = new ArrayList<>();
    @OneToMany
    private List<Like> likes = new ArrayList<>();
    @OneToMany
    private List<Comment> comments = new ArrayList<>();


}
