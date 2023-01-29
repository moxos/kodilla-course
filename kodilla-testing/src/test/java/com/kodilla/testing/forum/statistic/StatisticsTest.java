package com.kodilla.testing.forum.statistic;

import com.kodilla.testing.forum.statistics.CalculateStatistic;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)

public class StatisticsTest {

    @Mock
    private Statistics statistics;

    private List<String> generateUsers(int Users) {
        List<String> resultList = new ArrayList<>();
        for (int n = 1; n <= Users; n++) {
            String name = "Name" + n;
            resultList.add(name);
        }
        return resultList;
    }

    private void mockStatistics(int numbersOfUsers, int posts, int comments) {
        when(statistics.usersNames()).thenReturn(generateUsers(numbersOfUsers));
        when(statistics.postsCount()).thenReturn(posts);
        when(statistics.commentsCount()).thenReturn(comments);
    }

    @Test
    void testAverageForZeroPosts(){
        CalculateStatistic calculateStatistic = new CalculateStatistic();
        mockStatistics(2,0,2);
        calculateStatistic.calculateAdvStatistics(statistics);
        Assertions.assertEquals(0,calculateStatistic.showAveragePosts());
        Assertions.assertEquals(0,calculateStatistic.showAverageCommentsPosts());
    }
    @Test
    void testAverageFor1000Posts(){
        CalculateStatistic calculateStatistic = new CalculateStatistic();
        mockStatistics(50,1000,1000);
        calculateStatistic.calculateAdvStatistics(statistics);
        Assertions.assertEquals(20,calculateStatistic.showAveragePosts());
        Assertions.assertEquals(1,calculateStatistic.showAverageCommentsPosts());
    }
    @Test
    void testAverageForZeroComments(){
        CalculateStatistic calculateStatistic = new CalculateStatistic();
        mockStatistics(2,15,0);
        calculateStatistic.calculateAdvStatistics(statistics);
        Assertions.assertEquals(0,calculateStatistic.showAverageCommentsUser());
        Assertions.assertEquals(0,calculateStatistic.showAverageCommentsPosts());
    }
    @Test
    void testMorePostThanComments(){
        CalculateStatistic calculateStatistic = new CalculateStatistic();
        mockStatistics(2,50,5);
        calculateStatistic.calculateAdvStatistics(statistics);
        Assertions.assertEquals(25,calculateStatistic.showAveragePosts());
        Assertions.assertEquals(0.1,calculateStatistic.showAverageCommentsPosts());
    }
    @Test
    void testMoreCommentsThanPosts(){
        CalculateStatistic calculateStatistic = new CalculateStatistic();
        mockStatistics(2,15,30);
        calculateStatistic.calculateAdvStatistics(statistics);
        Assertions.assertEquals(15,calculateStatistic.showAverageCommentsUser());
        Assertions.assertEquals(2,calculateStatistic.showAverageCommentsPosts());
    }
    @Test
    void testZeroUsers(){
        CalculateStatistic calculateStatistic = new CalculateStatistic();
        mockStatistics(0,15,30);
        calculateStatistic.calculateAdvStatistics(statistics);
        Assertions.assertEquals(0,calculateStatistic.showAveragePosts());
        Assertions.assertEquals(0,calculateStatistic.showAverageCommentsUser());
    }

    @Test
    void test100Users(){
        CalculateStatistic calculateStatistic = new CalculateStatistic();
        mockStatistics(100,240,2200);
        calculateStatistic.calculateAdvStatistics(statistics);
        Assertions.assertEquals(2.4,calculateStatistic.showAveragePosts());
        Assertions.assertEquals(22,calculateStatistic.showAverageCommentsUser());
    }
}

