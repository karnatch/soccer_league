package com.league;


public class TeamManager {
    private String name;
    private LeagueAnnouncement message = new LeagueAnnouncement();

    public TeamManager(String name) {
        super();
        this.name = name;
    }
    public void notification() {
        System.out.println("Hello, " + name + " " + message.title);
    }
    public void joinDepartment(LeagueAnnouncement mess) {
        message = mess;
    }
}

