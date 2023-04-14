package com.group.libraryapp.domain.user;

import com.group.libraryapp.domain.loanhistory.UserLoanHistory;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id = null;
    @Column(nullable = false, length = 20, name = "name")
    private String name;

    private Integer age;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<UserLoanHistory> userLoanHistories = new ArrayList<>();

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    protected User() {

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
    public void updateName(String name) {
        this.name = name;
    }
    public void loanBook(String bookName) {
        this.userLoanHistories.add(new UserLoanHistory(this, bookName));
    }
    public void returnBook(String bookName) {
        UserLoanHistory targetHistory = userLoanHistories.stream().filter(history -> history.getBookName()
                .equals(bookName)).findFirst().orElseThrow(IllegalArgumentException::new);
        targetHistory.doReturn();
    }
}
