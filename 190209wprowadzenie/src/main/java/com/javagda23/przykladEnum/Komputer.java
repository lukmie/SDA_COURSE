package com.javagda23.przykladEnum;

public class Komputer {
    private int moc;
    private String nazwaProducenta;
    private TypProcesora typProcesora;

    public Komputer(int moc, String nazwaProducenta, TypProcesora typProcesora) {
        this.moc = moc;
        this.nazwaProducenta = nazwaProducenta;
        this.typProcesora = typProcesora;
    }

    public int getMoc() {
        return moc;
    }

    public void setMoc(int moc) {
        this.moc = moc;
    }

    public String getNazwaProducenta() {
        return nazwaProducenta;
    }

    public void setNazwaProducenta(String nazwaProducenta) {
        this.nazwaProducenta = nazwaProducenta;
    }

    public TypProcesora getTypProcesora() {
        return typProcesora;
    }

    public void setTypProcesora(TypProcesora typProcesora) {
        this.typProcesora = typProcesora;
    }

    @Override
    public String toString() {
        return "Komputer{" +
                "moc=" + moc +
                ", nazwaProducenta='" + nazwaProducenta + '\'' +
                ", typProcesora=" + typProcesora +
                '}';
    }
}
