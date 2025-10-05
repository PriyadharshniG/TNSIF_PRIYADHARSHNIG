package com.tnsif.dayfour.encapsulation;

public class EncapsulationDemo {

    public static void main(String[] args) {
        // object creation
        OopsConceptDemo obj = new OopsConceptDemo();
        obj.setSerialNum(101);
        obj.setName("Pooja");
        obj.setAge(20);

        // Printing details properly
        System.out.println("Serial Number: " + obj.getSerialNum());
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());

        // OR directly using toString()
        System.out.println(obj);
    }
}
