package org.example;

public class Task {
    String desc;
    boolean status;

    public Task(String d) {
        desc = d;
        status = false;
    }

    public String getDesc() {
        return desc;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean s) {
        status = s;
    }
}
