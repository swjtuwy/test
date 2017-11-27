package com.observer;

public interface Stations {
    public void addOberver(Observers observrs);

    public void removeObserver(Observers observrs);

    public void notityObserver(String s);

}
