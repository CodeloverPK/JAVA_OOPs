package com.edureka;

// examine runtime polymorphism

// is class ko final key add kr do to  Inheritance nii ho payega
public class Man {

    final int age; // ydi yaha initialised ni kiye to constructor me hee krna hoga
    //is Method  ko final key add kr do to  Override  nii ho payega
    void pay(){

        System.out.println("Man Paying bill ");
    }

    // examine super key
    Man(){
        age=21;
        // this constructor invoked by super class automatic while child class object is created
        System.out.println("It is super class constructor!!!");
    }
    // examine super key
    String amount="Man have Money";
}
