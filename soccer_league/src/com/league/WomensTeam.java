package com.league;

public class WomensTeam extends Team {
    @Override
    void enterTeam() {
        System.out.println("Add womens team to league");
    }

    @Override
    void removeTeam() {
        System.out.println("Remove womens team from league");
    }
}



