package com.league;

public class League {

    public static void openingAnnouncement()
    {
        LeagueAnnouncement announcement = new LeagueAnnouncement();
        TeamManager manager = new TeamManager("Team manager");

        announcement.join(manager);

        manager.joinDepartment(announcement);

        announcement.upload("we are excited to inform you of the start of the league");
    }

    public static void closingAnnouncement()
    {
        LeagueAnnouncement announcement = new LeagueAnnouncement();
        TeamManager manager = new TeamManager("Elon");

        announcement.join(manager);

        manager.joinDepartment(announcement);

        announcement.upload("we are excited to inform you of the closing of the league");
    }
}

