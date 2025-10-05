package com.tnsif.dayfour.encapsulation;


public class OopsConceptDemo {

    // Var declaration / Data members
    private int serialNum;
    private String name;
    private int age;

    // Getters and Setters
    public int getSerialNum() {
        return serialNum;
    }
    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // toString() for easy printing
    @Override
    public String toString() {
        return "OopsConceptDemo [serialNum=" + serialNum + ", name=" + name + ", age=" + age + "]";
    }
}
