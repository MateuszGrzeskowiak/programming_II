package pl.sda.programmingII.robot;

import java.util.Scanner;

public class Robot {
    private int poziomBaterii = 100;
    private String nazwaRobota;
    private boolean wlaczony = false;

    public Robot(String nazwaRobota) {
        this.nazwaRobota = nazwaRobota;
    }

    public void poruszRobotem(RuchRobota ruch) {
        if (!wlaczony){
            System.err.println("Robot jest wylaczony");
            return;
        }
        if (poziomBaterii >= ruch.getZuzycieEnergii()){
            System.out.println("Wykonuje ruch robota: " + ruch);
            poziomBaterii -= ruch.getZuzycieEnergii();
        }else{
            System.err.println("Niewystarczajaca ilosc energii");
        }

    }

    public void naladuj() {
        if (wlaczony) {
            System.err.println("Nie mozna ladowac gdy wlaczony");
        } else {
            poziomBaterii = 100;
            System.out.println("Robot naladowany");
        }

    }

    public void wlacz() {
        if (wlaczony) {
            System.err.println("Robot jest juz wlaczony");
        } else {
            wlaczony = true;
            System.out.println("Wlaczam robota");
        }
    }

    public void wylacz() {
        if (!wlaczony) {
            System.err.println("Robot jest juz wylaczony");
        } else {
            wlaczony = false;
            System.out.println("Wylaczam robota");
        }

    }
}


