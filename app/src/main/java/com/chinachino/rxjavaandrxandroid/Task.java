package com.chinachino.rxjavaandrxandroid;

public class Task {
    private String description;
    private boolean isComplete;

    private int property;

    public Task(String description, boolean isComplete, int property) {
        this.description = description;
        this.isComplete = isComplete;
        this.property = property;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    public int getProperty() {
        return property;
    }

    public void setProperty(int property) {
        this.property = property;
    }
}
