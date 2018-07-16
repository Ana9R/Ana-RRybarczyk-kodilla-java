package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class CourseUser implements Observable {

    private final String username;
    private List<Observer> observers = new ArrayList<>();
    private List<String> tasks = new ArrayList<>();

    public CourseUser(String username) {
        this.username = username;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void addTask(String task){
        tasks.add(task);
        notifyObservers();
    }

    public String getUsername() {
        return username;
    }

    public List<String> getTasks() {
        return tasks;
    }
}
