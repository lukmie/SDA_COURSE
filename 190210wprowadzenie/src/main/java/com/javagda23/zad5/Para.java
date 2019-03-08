package com.javagda23.zad5;

public class Para<T> {
    private T prawa;
    private T lewa;

    public Para(T prawa, T lewa) {
        this.prawa = prawa;
        this.lewa = lewa;
    }

    public T getPrawa() {
        return prawa;
    }

    public void setPrawa(T prawa) {
        this.prawa = prawa;
    }

    public T getLewa() {
        return lewa;
    }

    public void setLewa(T lewa) {
        this.lewa = lewa;
    }

    @Override
    public String toString() {
        return "Para{" +
                "prawa=" + prawa +
                ", lewa=" + lewa +
                '}';
    }
}
