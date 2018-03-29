package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {

        userList.add(new ForumUser(001, "Anna", 'F', LocalDate.of(2017, 2, 12), 8));
        userList.add(new ForumUser(002, "Krzysztof", 'M', LocalDate.of(1982, 7, 15), 15));
        userList.add(new ForumUser(003, "Michał", 'M', LocalDate.of(1985, 8, 19), 9));
        userList.add(new ForumUser(004, "Karolina", 'F', LocalDate.of(1988, 9, 10), 9));
        userList.add(new ForumUser(005, "Piotr", 'M', LocalDate.of(2000, 6, 28), 5));
        userList.add(new ForumUser(006, "Agnieszka", 'F', LocalDate.of(1999, 3, 21), 11));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }

}
