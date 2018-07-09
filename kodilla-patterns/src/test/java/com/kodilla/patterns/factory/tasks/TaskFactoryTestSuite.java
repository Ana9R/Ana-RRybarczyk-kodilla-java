package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task task = factory.makeTask(TaskFactory.SHOPPING);

        //Then
        Assert.assertEquals(false, task.isTaskExecuted());
        Assert.assertEquals("Shopping task", task.getTaskName());
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task task = factory.makeTask(TaskFactory.PAINTING);

        //Then
        Assert.assertEquals(false, task.isTaskExecuted());
        Assert.assertEquals("Painting task", task.getTaskName());
    }

    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task task = factory.makeTask(TaskFactory.DRIVING);

        //Then
        Assert.assertEquals(false, task.isTaskExecuted());
        Assert.assertEquals("Driving task", task.getTaskName());
    }
}
