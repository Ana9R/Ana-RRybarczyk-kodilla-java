package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    private static int testCounter = 0;

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void calculateAdvStatistics1() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersNames = new ArrayList<String>();
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postCount()).thenReturn(0);
        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, forumStatistics.getAmountUsers());
        Assert.assertEquals(0, forumStatistics.getAmountComments());
        Assert.assertEquals(0, forumStatistics.getAmountPosts());
        Assert.assertEquals(0, forumStatistics.getAverageAmountPostsPerUser(), 0.00002);
        Assert.assertEquals(0, forumStatistics.getAverageAmountCommentsPerUsers(), 0.00002);
        Assert.assertEquals(0, forumStatistics.getAverageAmountCommentsPerPost(), 0.00002);
    }

    @Test
    public void calculateAdvStatistics2() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersNames = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("Guzik");
        }
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(500);
        when(statisticsMock.postCount()).thenReturn(1000);
        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(100, forumStatistics.getAmountUsers());
        Assert.assertEquals(500, forumStatistics.getAmountComments());
        Assert.assertEquals(1000, forumStatistics.getAmountPosts());
        Assert.assertEquals(10, forumStatistics.getAverageAmountPostsPerUser(), 0.00002);
        Assert.assertEquals(5, forumStatistics.getAverageAmountCommentsPerUsers(), 0.00002);
        Assert.assertEquals(0.5, forumStatistics.getAverageAmountCommentsPerPost(), 0.00002);
    }

    @Test
    public void calculateAdvStatistics3() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersNames = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("Guzik");
        }
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(2000);
        when(statisticsMock.postCount()).thenReturn(1000);
        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(100, forumStatistics.getAmountUsers());
        Assert.assertEquals(2000, forumStatistics.getAmountComments());
        Assert.assertEquals(1000, forumStatistics.getAmountPosts());
        Assert.assertEquals(10, forumStatistics.getAverageAmountPostsPerUser(), 0.00002);
        Assert.assertEquals(20, forumStatistics.getAverageAmountCommentsPerUsers(), 0.00002);
        Assert.assertEquals(2, forumStatistics.getAverageAmountCommentsPerPost(), 0.00002);
    }

}
