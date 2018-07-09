package com.kodilla.patterns.factory.tasks;

public interface Task {
    void executeTask();
    boolean isTaskExecuted();
    String getTaskName();
}
