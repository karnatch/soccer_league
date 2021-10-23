package com.league.commandpattern;


public class AddTeam {

    private String team = "RedBull Sparrow";
    private int players = 20;

    public void add(){
        System.out.println("Team"+ team +"with "+ players+ "has joined the league");
    }
}

