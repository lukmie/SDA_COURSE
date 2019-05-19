package com.lukmie.zad7;
import java.util.List;

public class ZadanieQuizowe {
    private String pytanie;
    private List<String> odpowiedzi;

    public ZadanieQuizowe(String pytanie, List<String> odpowiedzi) {
        this.pytanie = pytanie;
        this.odpowiedzi = odpowiedzi;
    }

    public String getPytanie() {
        return pytanie;
    }

    public void setPytanie(String pytanie) {
        this.pytanie = pytanie;
    }

    public List<String> getOdpowiedzi() {
        return odpowiedzi;
    }

    public void setOdpowiedzi(List<String> odpowiedzi) {
        this.odpowiedzi = odpowiedzi;
    }

    @Override
    public String toString() {
        return "ZadanieQuizowe{" +
                "pytanie='" + pytanie + '\'' +
                ", odpowiedzi=" + odpowiedzi +
                '}';
    }
}
