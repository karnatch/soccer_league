package com.league;

public class MensTeam extends Team {
    @Override
    void enterTeam() {
        System.out.println("Add mens team to league");
    }

    @Override
    void removeTeam() {
        System.out.println("Remove mens team from league");
    }
}


