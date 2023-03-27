package com.example.kodilla.spring.portfolio;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class BoardTestSuite {

    @Autowired
    private Board board;

    @Test
     public void testTaskAdd(){


            board.getToDoList().getTasks().add("First task");
            board.getInProgressList().getTasks().add("Second task");
            board.getDoneList().getTasks().add("Third task");

        Assertions.assertEquals("First task", board.getToDoList().getTasks().get(0));
        Assertions.assertEquals("Second task", board.getInProgressList().getTasks().get(0));
        Assertions.assertEquals("Third task", board.getDoneList().getTasks().get(0));

    }
}
