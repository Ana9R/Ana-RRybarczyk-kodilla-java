package com.kodilla.spring.portfolio;

import java.util.List;

public class Board {
    TaskList toDoList;
    TaskList inProgressList;
    TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public void addTaskToDo(String task) {
        toDoList.addTask(task);
    }

    public void addTaskInProgress(String task) {
        inProgressList.addTask(task);
    }

    public void addTaskDoneList(String task) {
        doneList.addTask(task);
    }

    public List<String> getTaskToDo() {
        return toDoList.getTasks();
    }

    public List<String> getTaskInProgress() {
        return inProgressList.getTasks();
    }

    public List<String> getTaskDoneList() {
        return doneList.getTasks();
    }
}
