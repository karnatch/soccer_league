package com.league.commandpattern;


public class EnrollTeam implements Enroll {
    private AddTeam a;

    public void execute() {
        a.add();
    }
}

