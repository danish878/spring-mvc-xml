package com.danny.jba.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@NoArgsConstructor

@Entity
public class Item {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(length = 1000)
    private String title;

    @Lob
//    @Type(type = "org.hibernate.type.StringClobType") // works for PostGre but check if this property needs to change for other databases
    @Column(length = Integer.MAX_VALUE)
    private String description;

    @Column(name = "published_date")
    private Date publishedDate;

    @Column(length = 1000)
    private String link;

    @ManyToOne
    @JoinColumn(name = "blog_id")
    private Blog blog;
}