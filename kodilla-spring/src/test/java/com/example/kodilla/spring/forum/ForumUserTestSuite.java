package com.example.kodilla.spring.forum;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ForumUserTestSuite {

        @Test
        void testUsername(){
            ApplicationContext context = new AnnotationConfigApplicationContext("com.example.kodilla.spring.forum");
            ForumUser forumUser = context.getBean(ForumUser.class);
            String username = forumUser.getUsername();
            assertEquals("John Smith", username);
        }
}
