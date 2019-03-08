package com.javagda23.dodatkowe;

public class Robot {
    private int poziomBaterii;
    private String nazwaRobota;
    private boolean czyWlaczony;

    public Robot(int poziomBaterii, String nazwaRobota, boolean czyWlaczony) {
        this.poziomBaterii = poziomBaterii;
        this.nazwaRobota = nazwaRobota;
        this.czyWlaczony = czyWlaczony;
    }

    public int getPoziomBaterii() {
        return poziomBaterii;
    }

    public void setPoziomBaterii(int poziomBaterii) {
        this.poziomBaterii = poziomBaterii;
    }

    public String getNazwaRobota() {
        return nazwaRobota;
    }

    public void setNazwaRobota(String nazwaRobota) {
        this.nazwaRobota = nazwaRobota;
    }

    public boolean isCzyWlaczony() {
        return czyWlaczony;
    }

    public void setCzyWlaczony(boolean czyWlaczony) {
        this.czyWlaczony = czyWlaczony;
    }

    public void wlaczRobota() {
        this.czyWlaczony = true;
        System.out.println("Hello!");
    }

    public void wylaczRobota() {
        if(!czyWlaczony){
            System.out.println("Robot jest juz wylaczony.");
            return; //ten return; przerywa działanie metody i to co poza klamrami się nie wykonuje
        }
        this.czyWlaczony = false;
        System.out.println("Bye!");
    }

    public void naladujRobota() {
        System.out.println("Poziom przed: " + getPoziomBaterii());
        if (!czyWlaczony) {
            this.poziomBaterii = 100;
        } else{
            System.out.println("Aby naladować robota musisz go najpierw wylaczyc");
        }
        System.out.println("Poziom po: " + getPoziomBaterii());
    }

    public void poruszRobotem(RuchRobota ruchRobota) {
        if(!isCzyWlaczony()){
            System.out.println("Robot wylaczony, musisz go wlaczyc");
        } else if (getPoziomBaterii() > 0) {//>ruchRobota.getUzycieBaterii()
            poziomBaterii -= ruchRobota.getUzycieBaterii();
        } else {
            System.out.println("Nie możesz wykonac ruchu, bateria rozladowana.");
        }
    }
}
