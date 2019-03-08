package com.javagda23.zad15;

import java.util.Objects;

public class ParaLiczb {
    private int a;
    private int b;

    public ParaLiczb(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ParaLiczb)) return false;
        ParaLiczb paraLiczb = (ParaLiczb) o;
        return a == paraLiczb.a &&
                b == paraLiczb.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}
