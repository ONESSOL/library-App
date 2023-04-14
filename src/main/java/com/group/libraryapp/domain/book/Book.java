package com.group.libraryapp.domain.book;

import javax.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id = null;
    @Column(nullable = false, length = 20, name = "name")
    private String name;

    public Book(String name) {
        this.name = name;
    }
    protected Book() {

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
