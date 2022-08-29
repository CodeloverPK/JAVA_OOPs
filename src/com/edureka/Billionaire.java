package com.edureka;

// Runtime polymorphism
public class Billionaire extends Man {
    @Override
    void pay(){
        System.out.println("Billionaire Paying bill");
    }
    void hello(){
        System.out.println("Hello Guys");
    }

    // examine super key
    String amount="Billionaire have much Money";

    void showMoney(){
        System.out.println("Subclass Data, "+ amount);
        System.out.println("Super class Data, "+super.amount);
    }

    public static void main(String[] args){

        Man obj=new Man();
        obj.pay();
/*
        Man obj1=new Billionaire(); // runtime polymorphism
        obj1.pay(); //  Jo Method common hogi wahi Man obj access kr skta hai

        Billionaire obj2=new Billionaire();
        obj2.pay();
        obj2.hello();

        obj2.showMoney();

 */

    }
}
