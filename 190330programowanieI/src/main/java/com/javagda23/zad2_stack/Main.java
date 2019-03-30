package com.javagda23.zad2_stack;

public class Main {
    public static void main(String[] args) {
        Tuba t = new Tuba();
        PilkaTenisowa pilkaTenisowa1 = new PilkaTenisowa("zielona");
        PilkaTenisowa pilkaTenisowa2 = new PilkaTenisowa("czerwona");
        PilkaTenisowa pilkaTenisowa3 = new PilkaTenisowa("niebieska");
        PilkaTenisowa pilkaTenisowa4 = new PilkaTenisowa("zolta");
        t.addItem(pilkaTenisowa1);
        t.addItem(pilkaTenisowa2);
        t.addItem(pilkaTenisowa3);
        t.addItem(pilkaTenisowa4);
        t.popItem();
        t.popItem();
        t.popItem();
        t.popItem();
//        t.popItem();
    }
}
