package pl.sda.programmingII.robot;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot("C3PO");
        Scanner scan = new Scanner(System.in);

        String komenda;

        do{
            System.out.println("Podaj komende:");
            System.out.println("   - ruch [KROK_LEWA, KROK_PRAWA, RUCH_REKA_LEWA RUCH_REKA_PRAWA, SKOK]");
            System.out.println("   - naladuj");
            System.out.println("   - wlacz");
            System.out.println("   - wylacz");
            komenda = scan.nextLine();
            if (komenda.equalsIgnoreCase("wlacz")){
                robot.wlacz();
            }else if (komenda.equalsIgnoreCase("wylacz")){
                robot.wylacz();
            }else if (komenda.equalsIgnoreCase("naladuj")){
                robot.naladuj();
            }else if (komenda.startsWith("ruch")){
                String[] slowa = komenda.split(" "); //dzieli komende na slowa
                String rodzajRuchu = slowa[1]; // wyciąga słowo w którym znajduje się rodzaj ruchu
                //
                RuchRobota ruch = RuchRobota.valueOf(rodzajRuchu.toUpperCase());
                robot.poruszRobotem(ruch);
            }

        }while (!komenda.equalsIgnoreCase("quit"));

    }
}
