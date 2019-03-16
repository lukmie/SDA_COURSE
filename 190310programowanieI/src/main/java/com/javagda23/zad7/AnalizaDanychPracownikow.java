package com.javagda23.zad7;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import static com.javagda23.zad7.Pracownicy.PRACOWNICY;

public class AnalizaDanychPracownikow {
    public Set<Pracownik> metoda1(){
        return PRACOWNICY.stream().collect(Collectors.toSet());
    }

    public long metoda2b() {
        return PRACOWNICY.stream().collect(Collectors.counting());
    }

    public Optional<Integer> metoda3a() {
        return PRACOWNICY.stream().map(zarobki -> zarobki.getPensja()).reduce(Integer::sum); //do mapy przekazuje pracownika wiec zmienna nazywa sie pracownik a nie pensja !!! code naming convention
    }

    public Optional<Integer> metoda3b() {
        return  PRACOWNICY.stream().map(Pracownik::getPensja).collect(Collectors.reducing(Integer::sum));
    }

    public Map<Pracownik, Departament> metoda4() {//co przyjmuje to map metoda
        return  PRACOWNICY.stream().collect(Collectors.toMap(Function.identity(),Pracownik::getDepartament));
//        return  PRACOWNICY.stream().collect(Collectors.toMap(pracownik -> pracownik, pracownik -> pracownik.getDepartament()));//pierwsza f. przyjmuje pracownika i druga tez pracownika
    }

//    public Map<Pracownik, Integer> metoda5() {
    public Map<String, Integer> metoda5() {
//        return  PRACOWNICY.stream().collect(Collectors.toMap(Function.identity(),Pracownik::getPensja));
        return  PRACOWNICY.stream().collect(Collectors.toMap(Pracownik::getImie,Pracownik::getPensja));
    }

    public Map<Boolean, List<Pracownik>> metoda6() {
        return  PRACOWNICY.stream().collect(Collectors.partitioningBy(pracownik -> Plec.K.equals(pracownik.getPlec())));
    }

    public Map<Departament, List<Pracownik>> metoda7() {
        return  PRACOWNICY.stream().collect(Collectors.groupingBy(Pracownik::getDepartament));
    }

    public Map<Plec, Integer> metoda8() {//mamy 3 arg, plec, pensja i zredukuj  do jednej
        return  PRACOWNICY.stream().collect(Collectors.toMap(
                Pracownik::getPlec,
                Pracownik::getPensja,
                Integer::sum
        ));
    }
    //pogrupowac pracownikow po plci zliczajac ilu ich jest czyli winikiem będzie mapa plec na ilość osob


}
