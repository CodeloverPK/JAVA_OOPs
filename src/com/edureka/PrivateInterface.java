package com.edureka;

interface myInterface {
    void greet();
    default void say(){
        hello();
    }

    private void hello(){
        System.out.println("Hello Guys");
    }
}
public  class PrivateInterface implements myInterface {
    public void greet(){
        System.out.println("Greeting: Good Morning!!");
    }
    public  static void main(String[] args){
        PrivateInterface obj=new PrivateInterface();
        obj.say();
        obj.greet();
    }
}