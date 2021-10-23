package com.league;

import java.util.Scanner;


public class Login {

    public String adminLogin(){
        System.out.print(" username = username & password = password"+'\n' );
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter username- ");
        String userName = sc.nextLine();
        System.out.print("Enter password- ");
        String password = sc.nextLine();

        if ( userName.equals("username") ) {
            if ( password.equals("password")) {
                System.out.println("login was successful");
                return "success";
            } else {
                System.out.println("failed, wrong password, try again");
                return "failed";
            }
        } else {
            System.out.println("failed, Wrong username");
            return "failed";
        }
    }

}

