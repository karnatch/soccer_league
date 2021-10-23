package com.league.commandpattern;


import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List<Enroll> enrollList = new ArrayList<Enroll>();

    public void makeEnrollment(Enroll e){
        enrollList.add(e);
    }

    public void clearEnrollments(){

        for (Enroll en : enrollList) {
            en.execute();
        }
        enrollList.clear();
    }
}

