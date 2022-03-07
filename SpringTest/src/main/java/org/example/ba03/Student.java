package org.example.ba03;

import org.example.ba01.School;

public class Student {
    private String MyName;
    private int MyAge;
    private School myXueXiao;

    public Student(String myName, int myAge, School myXueXiao) {
        System.out.println("student的有参数构造方法");
        MyName = myName;
        MyAge = myAge;
        this.myXueXiao = myXueXiao;
    }

    public String getMyName() {
        return MyName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "MyName='" + MyName + '\'' +
                ", MyAge=" + MyAge +
                ", myXueXiao=" + myXueXiao +
                '}';
    }

    public void setMyName(String myName) {
        MyName = myName;
    }

    public int getMyAge() {
        return MyAge;
    }

    public void setMyAge(int myAge) {
        MyAge = myAge;
    }

    public School getMyXueXiao() {
        return myXueXiao;
    }

    public void setMyXueXiao(School myXueXiao) {
        this.myXueXiao = myXueXiao;
    }

}
