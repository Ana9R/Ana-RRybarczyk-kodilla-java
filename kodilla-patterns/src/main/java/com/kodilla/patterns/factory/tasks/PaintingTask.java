package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {

    private String taskName;
    private String color;
    private String whatToPaint;
    private boolean executed;

    public PaintingTask(String taskName, String color, String whatToPaint){
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        this.executed = true;
    }

    @Override
    public boolean isTaskExecuted() {
        return executed;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getWhatToPaint() {
        return whatToPaint;
    }

    public void setWhatToPaint(String whatToPaint) {
        this.whatToPaint = whatToPaint;
    }
}
