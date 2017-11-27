package com.adapter;

public class DuckTestDriver {

    public static void main(String ... args){
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();

        Duck turkeyAadapter = new TurkeyAdapter(turkey);

        System.out.println("the turkey say:");
        turkey.gobble();
        turkey.fly();

        testDuck(duck);

        testDuck(turkeyAadapter);

    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
