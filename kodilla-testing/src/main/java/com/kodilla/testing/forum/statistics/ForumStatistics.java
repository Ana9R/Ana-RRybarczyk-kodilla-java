package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    int amountUsers;
    int amountPosts;
    int amountComments;
    double averageAmountPostsPerUser;
    double averageAmountCommentsPerUsers;
    double averageAmountCommentsPerPost;

    public int getAmountUsers() {
        return amountUsers;
    }

    public int getAmountPosts() {
        return amountPosts;
    }

    public int getAmountComments() {
        return amountComments;
    }

    public double getAverageAmountPostsPerUser() {
        return averageAmountPostsPerUser;
    }

    public double getAverageAmountCommentsPerUsers() {
        return averageAmountCommentsPerUsers;
    }

    public double getAverageAmountCommentsPerPost() {
        return averageAmountCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        amountUsers = statistics.usersNames().size();
        amountPosts = statistics.postCount();
        amountComments = statistics.commentsCount();
        if (amountUsers == 0) {
            averageAmountPostsPerUser = 0;
            averageAmountCommentsPerUsers = 0;
        } else {
            averageAmountPostsPerUser = amountPosts / (double)amountUsers;
            averageAmountCommentsPerUsers = amountComments / (double)amountUsers;
        }
        if (amountPosts == 0) {
            averageAmountCommentsPerPost = 0;
        } else {
            averageAmountCommentsPerPost = amountComments / (double)amountPosts;
        }
    }
}
