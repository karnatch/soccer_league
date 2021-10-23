package com.league;


public abstract class Team {

    abstract void enterTeam();
    abstract void removeTeam();

    public final void registerTeam(){
        enterTeam();
    }

    public final void cancelTeam(){
        removeTeam();
    }
}

