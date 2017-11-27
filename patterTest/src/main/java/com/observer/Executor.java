package com.observer;

public class Executor {

    public static void main(String[] args) {
        Stations station = new Station();
        Observer a5= new Observer("a5");
        station.addOberver(new Observer("a1"));
        station.addOberver(new Observer("a2"));
        station.addOberver(new Observer("a3"));
        station.addOberver(new Observer("a4"));
        station.addOberver(a5);
        station.notityObserver("   aatest 你好");
        station.removeObserver(a5);
        station.notityObserver("     你好");
    }
}
