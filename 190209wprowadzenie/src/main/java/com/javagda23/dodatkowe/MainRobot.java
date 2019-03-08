package com.javagda23.dodatkowe;

import java.util.Scanner;

public class MainRobot {
    public static void main(String[] args) {
        Robot robot = new Robot(100, "iRobot", true);
        Scanner sc = new Scanner(System.in);


        String ruch;
        while (true){
            System.out.println("Wybierz polecenie: \n- ruch\n- naladuj\n- wlacz\n- wylacz\n- quit");
            String polecenie = sc.nextLine();
            switch (polecenie) {
                case "ruch":
                    System.out.println("Wybierz rodzaj ruchu [KROK_LEWA, KROK_PRAWA, RUCH_REKA_LEWA, RUCH_REKA_PRAWA, SKOK]: ");
                    ruch = sc.nextLine();
                    robot.poruszRobotem(RuchRobota.valueOf(ruch.trim().toUpperCase()));
                    System.out.println(robot.getPoziomBaterii());
                    break;
                case "naladuj":
                    robot.naladujRobota();
                    break;
                case "wlacz":
                    robot.wlaczRobota();
                    break;
                case "wylacz":
                    robot.wylaczRobota();
                    break;
                default:
                    System.out.println("Goodbye!");
            }
            if(polecenie.equals("quit")){
                break;
            }
        }



    }
}
