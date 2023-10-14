package com.mycompany.csc325_oop_designreview_lab;

public class Freshman extends Student{

    private short  credits;

    public Freshman(String Name, short Age, short Credits) {
       super(Name, Age);

       this.credits=credits;
    }
    @Override
    public String toString(){
        return

                "Name: " + super.getName()+
                "credits:" + credits +
                        "GPA:"+ super.getGpa()+ '}';

    }
}

