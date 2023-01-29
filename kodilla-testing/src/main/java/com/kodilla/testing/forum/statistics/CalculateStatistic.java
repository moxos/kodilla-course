package com.kodilla.testing.forum.statistics;

public class CalculateStatistic {
        double numbersofusers;
        double posts;
        double comments;
        double averagePosts;
        double averageCommentsUser;
        double averageCommentsPosts;

    public void calculateAdvStatistics(Statistics statistics) {
        numbersofusers = statistics.usersNames().size();
        posts = statistics.postsCount();
        comments = statistics.commentsCount();
        if (numbersofusers > 0) {
            averagePosts = posts / numbersofusers;
            averageCommentsUser = comments / numbersofusers;

        } else {
            averagePosts = 0;
            averageCommentsUser = 0;
        }
        if(posts >0) {
            averageCommentsPosts = comments / posts;
        }else{
            averageCommentsPosts =0;
        }
    }

    public double showAveragePosts(){
        return averagePosts;
    }
    public double showAverageCommentsUser(){
        return averageCommentsUser;
    }
    public double showAverageCommentsPosts(){
        return averageCommentsPosts;
    }

}
