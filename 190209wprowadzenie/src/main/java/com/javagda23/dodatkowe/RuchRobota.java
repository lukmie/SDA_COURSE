package com.javagda23.dodatkowe;

public enum RuchRobota {
    KROK_LEWA(5),
    KROK_PRAWA(5),
    RUCH_REKA_LEWA(2),
    RUCH_REKA_PRAWA(2),
    SKOK(50);

    private int uzycieBaterii;

    RuchRobota(int uzycieBaterii) {
        this.uzycieBaterii = uzycieBaterii;
    }

    public int getUzycieBaterii() {
        return uzycieBaterii;
    }
}
