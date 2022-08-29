package com.edureka;

interface DemoClass extends DemoInterface1 ,DemoInterface2{
    abstract void greet();

    // default keyword is use to implement a method inside an interface
    // but it can't be override or change further

    default void money(){
        System.out.println("Money is Necessory to survive");
    }


    static void staticFun(){
        System.out.println("Static Interface of Democlass Interface ");
    }

}
