package com.javagda23.zad6;

import java.util.Arrays;
import java.util.List;

public class Post {
    private String temat;
    private String tag;
    private Integer liczbaZnakow;
    private List<Komentarz> listaKomentarzy;

    public Post(String temat, String tag, Integer liczbaZnakow, Komentarz ... listaKomentarzy) {
        this.temat = temat;
        this.tag = tag;
        this.liczbaZnakow = liczbaZnakow;
        if(listaKomentarzy != null){
            this.listaKomentarzy = Arrays.asList(listaKomentarzy);
        }
    }

    public String getTemat() {
        return temat;
    }

    public void setTemat(String temat) {
        this.temat = temat;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Integer getLiczbaZnakow() {
        return liczbaZnakow;
    }

    public void setLiczbaZnakow(Integer liczbaZnakow) {
        this.liczbaZnakow = liczbaZnakow;
    }

    public List<Komentarz> getListaKomentarzy() {
        return listaKomentarzy;
    }

    public void setListaKomentarzy(List<Komentarz> listaKomentarzy) {
        this.listaKomentarzy = listaKomentarzy;
    }

    @Override
    public String toString() {
        return "Post{" +
                "temat='" + temat + '\'' +
                ", tag='" + tag + '\'' +
                ", liczbaZnakow=" + liczbaZnakow +
                ", listaKomentarzy=" + listaKomentarzy +
                '}';
    }
}
