package com.javagda23.zad5;

import com.javagda23.zad1_zad2.Czlowiek;

public class JedzacyMetodyInstancji implements IJedzacy{

    @Override
    public void jedz(IPotrafiacyJesc potrafiacyJesc, String cos) {
        potrafiacyJesc.jedz(cos);
    }
}
