package com.kodilla.stream.forumuser;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List <ForumUser> list = new ArrayList<>();

    public Forum(){
        list.add(new ForumUser(1, "Tom",'M', LocalDate.of(2003,4,21), 256));
        list.add(new ForumUser(2, "Elisabeth",'K', LocalDate.of(2011,7,1), 74));
        list.add(new ForumUser(3, "Jackson",'M', LocalDate.of(2007,12,18), 12));
        list.add(new ForumUser(4, "Lucas",'M', LocalDate.of(1985,3,5), 1111));
        list.add(new ForumUser(5, "Sophia",'K', LocalDate.of(1993,9,23), 256));
        list.add(new ForumUser(6, "Erick",'M', LocalDate.of(1993,1,2), 34));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(list);
    }
}
