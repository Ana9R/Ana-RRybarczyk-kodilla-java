package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class MentorTest {

    @Test
    public void testUpdate() {
        //given
        CourseUser johnSmith = new CourseUser("John Smith");
        CourseUser tomasJohns = new CourseUser("Tomas Johns");
        CourseUser mandyWelback = new CourseUser("Mandy Welback");

        Mentor dannyDaniels = new Mentor("Danny Daniels");
        Mentor tonyStone = new Mentor("Tony Stone");

        johnSmith.registerObserver(dannyDaniels);
        tomasJohns.registerObserver(dannyDaniels);
        mandyWelback.registerObserver(dannyDaniels);
        mandyWelback.registerObserver(tonyStone);

        //when
        johnSmith.addTask("Task 1");
        tomasJohns.addTask("Task 2");
        mandyWelback.addTask("Task 3");
        mandyWelback.addTask("Task 4");

        //then
        assertEquals(2, tonyStone.getUpdateCount());
        assertEquals(4, dannyDaniels.getUpdateCount());

    }
}