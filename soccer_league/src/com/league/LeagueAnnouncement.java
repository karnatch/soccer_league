package com.league;

import java.util.ArrayList;
import java.util.List;

public class LeagueAnnouncement {
    private List<TeamManager> members = new ArrayList<>();
    String title;
    public void join(TeamManager client) {
        members.add(client);
    }
    public void exit(TeamManager client) {
        members.remove(client);
    }
    public void notifyManagers() {
        for(TeamManager member: members) {
            member.notification();
        }
    }
    public void upload(String title) {
        this.title = title;
        notifyManagers();
    }
}

