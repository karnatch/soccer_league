package com.league;

import com.league.commandpattern.EnrollTeam;
import com.league.commandpattern.Invoker;
import com.league.iteratorpattern.AvailableGround;
import com.league.iteratorpattern.GroundCollection;

public class Main {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {

        Login l = new Login();
        String logRes = l.adminLogin();
        if(logRes == "success"){
            League adm = new League();
            adm.openingAnnouncement();
            MensTeam mt = new MensTeam();
            mt.registerTeam();

            GroundCollection g = new GroundCollection();
            AvailableGround a = new AvailableGround(g);
            a.availableGrounds();

            EnrollTeam e = new EnrollTeam();
            Invoker i = new Invoker();
            i.makeEnrollment(e);
        } else {
            System.out.println("Please Login to proceed");
        }

    }
}

