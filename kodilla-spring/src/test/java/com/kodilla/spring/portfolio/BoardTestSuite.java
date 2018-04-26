package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class BoardTestSuite {
    @Test
    public void testAddTaskToDo() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = (Board) context.getBean("board");

        //When
        board.addTaskToDo("Implement validation");

        //Then
        List<String> list = board.getTaskToDo();
        Assert.assertEquals(1, list.size());
        Assert.assertEquals("Implement validation", list.get(0));
    }

    @Test
    public void testAddTaskInProgress() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = (Board) context.getBean("board");

        //When
        board.addTaskInProgress("Implement tests");


        //Then
        List<String> list = board.getTaskInProgress();
        Assert.assertEquals(1, list.size());
        //Assert.assertEquals("Implement tests", list.get(0));
    }

    @Test
    public void testAddTaskDoneList() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = (Board) context.getBean("board");

        //When
        board.addTaskDoneList("Implement service");

        //Then
        List<String> list = board.getTaskDoneList();
        Assert.assertEquals(1, list.size());
        Assert.assertEquals("Implement service", list.get(0));
    }
}
