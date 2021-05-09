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
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long postId;
    @ManyToOne
    private User user;
    private String messageBody;
    @OneToMany
    private List<Comment> comments = new ArrayList<>();
    @OneToMany
    private List<Like> likes = new ArrayList<>();

}
