package com.observer;

public class Observer implements Observers {
    private String name;

    public Observer(String name) {
        this.name = name;
    }

    public void execute(String s) {
        System.out.println(name + s);
    }
}
