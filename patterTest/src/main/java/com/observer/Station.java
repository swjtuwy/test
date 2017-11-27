package com.observer;

import java.util.ArrayList;
import java.util.List;

public class Station implements Stations {

    private List<Observers> list = new ArrayList<>();

    public void addOberver(Observers observers){
        list.add(observers);
    }

    public void removeObserver(Observers observers){
        list.remove(observers);
    }

    public void notityObserver(String s){
        for (Observers observers: list){
            observers.execute(s);
        }
    }

}
