package com.javagda23.zad5;

import java.util.*;

public class RejestrObywateli {
    private Map<String, Obywatel> map = new HashMap<>();

    public void dodajObywatela(String pesel, String imie, String nazwisko){
        map.put(pesel, new Obywatel(pesel, imie, nazwisko));
    }

    public List<Obywatel> znajdzObywateliUrodzonychPrzed(Integer rok) throws NoSuchObywatelException {
        List<Obywatel> list = new ArrayList<>();

        int r = Integer.parseInt(rok.toString().substring(2));//91

        for (Obywatel obywatel : map.values()) {
            if(Integer.parseInt(obywatel.getPesel().substring(0,2)) < r){
                list.add(obywatel);
            }
        }
        if (list.isEmpty()){
            throw new NoSuchObywatelException("Brak obywateli sprzed tego roku.");
        }
        return list;
    }

    public List<Obywatel> znajdzObywateliZRokuZImieniem(Integer rok, String imie) throws NoSuchObywatelException {
        List<Obywatel> list = new ArrayList<>();

        int r = Integer.parseInt(rok.toString().substring(2));//91

        for (Obywatel obywatel : map.values()) {
            if(Integer.parseInt(obywatel.getPesel().substring(0,2)) < r && obywatel.getImie().equals(imie)){
                list.add(obywatel);
            }
        }
        if (list.isEmpty()){
            throw new NoSuchObywatelException("Brak obywateli sprzed tego roku.");
        }
        return list;
    }

    public List<Obywatel> znajdzObywateliPoNazwisku(String nazwisko) throws NoSuchObywatelException {
        List<Obywatel> list = new ArrayList<>();

        for (Obywatel obywatel : map.values()) {
            if(obywatel.getNazwisko().equals(nazwisko)){
                list.add(obywatel);
            }
        }
        if (list.isEmpty()){
            throw new NoSuchObywatelException("Brak obywateli sprzed tego roku.");
        }
        return list;
    }

    public Optional<Obywatel> znajdzObywateliPoPeselu(String pesel) {
        List<Obywatel> list = new ArrayList<>();

        for (Obywatel obywatel : map.values()) {
            if(obywatel.getPesel().equals(pesel)){
                return Optional.ofNullable(obywatel);
            }
        }
        return Optional.empty();
    }


}
