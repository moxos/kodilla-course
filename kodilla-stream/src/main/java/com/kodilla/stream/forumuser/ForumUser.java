package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int id;
    private final String userName;
    private final char gender;
    private final LocalDate localDate;
    private final int posts;

    public ForumUser(int id, String userName, char sex, LocalDate localDate, int posts) {
        this.id = id;
        this.userName = userName;
        this.gender = sex;
        this.localDate = localDate;
        this.posts = posts;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public int getPosts() {
        return posts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", sex=" + gender +
                ", localDate=" + localDate +
                ", posts=" + posts +
                '}';
    }
}
