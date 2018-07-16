package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {

    private final String username;
    private int updateCount;

    public Mentor(String username) {
        this.username = username;
    }

    @Override
    public void update(CourseUser courseUser) {
        System.out.println(username + ": New task from " + courseUser.getUsername() + "\n"  +
                " (total " + courseUser.getTasks().size() + " tasks)");
        updateCount++;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
