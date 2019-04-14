package com.javagda23.zad5_tddKalkulatorWieku;

public class KalkulatorWieku {

    private static final String FORMAT_DATY = "\\d{2}-\\d{2}-\\d{4}";
    private static final int INDEKS_ROK = 2;
    private static final int INDEKS_MSC = 1;

    /**
     * Oblicza wiek osoby w danym dniu
     *
     * @param dataUrodzenia - format dd-mm-yyyy
     * @param wybranaData   - format dd-mm-yyyy
     * @return wiek osoby w wybranym dniu
     * wybranaData >= dataUrodzenia
     * obliczony wiek nie moze byc większy od 120
     * throws RunTimeException
     */

    //2
//    public static int obliczWiek(String dataUrodzenia, String wybranaData){
//        if (!dataUrodzenia.matches("\\d{2}-\\d{2}-\\d{4}")){
//            throw new RuntimeException("Data urodzenia nie jest poprawna");
//        }
//        return -1;
//    }

    //3
//        public static int obliczWiek(String dataUrodzenia, String wybranaData){
//        if (!dataUrodzenia.matches("\\d{2}-\\d{2}-\\d{4}")){
//            throw new RuntimeException("Data urodzenia nie jest poprawna");
//        } else if (!wybranaData.matches("\\d{2}-\\d{2}-\\d{4}")){
//            throw new RuntimeException("Wybrana data nie jest poprawna");
//        }
//        return -1;
    public static int obliczWiek(String dataUrodzenia, String wybranaData) {
        sprawdzFormatDat(dataUrodzenia, wybranaData);

        String[] dataUrodzeniaTab = dataUrodzenia.split("-");
        String[] wybranaDataTab = wybranaData.split("-");


        int iloscLatU = Integer.parseInt(dataUrodzeniaTab[2])*365 +  Integer.parseInt(dataUrodzeniaTab[1])*30 +
                Integer.parseInt(dataUrodzeniaTab[0]);
        int iloscLatW = Integer.parseInt(wybranaDataTab[2])*365 +  Integer.parseInt(wybranaDataTab[1])*30 +
                Integer.parseInt(wybranaDataTab[0]);

        System.out.println(iloscLatU);
        System.out.println("wybrana " + iloscLatW);

        if (iloscLatU > iloscLatW){
            throw new RuntimeException("Data urodzenia nie moze byc pozniej niz wybrana data.");
        }
        if ((iloscLatW - iloscLatU)/365 > 120){
            throw new RuntimeException("Osoba nie moze miec wiecej niz 120 lat!");
        }

        int wiek = obliczWiek(dataUrodzeniaTab, wybranaDataTab);
        sprawdzPoprawnoscWieku(wiek);


        return wiek;

    }

    private static int obliczWiek(String[] dataUrodzeniaTab, String[] wybranaDataTab) {
        int wiek = obliczRoznice(wybranaDataTab[INDEKS_ROK], dataUrodzeniaTab[INDEKS_ROK]);
        int roznicaMiesiecy = obliczRoznice(wybranaDataTab[INDEKS_MSC], dataUrodzeniaTab[INDEKS_MSC]);

        if (roznicaMiesiecy < 0) {
            wiek--;
        } else if (roznicaMiesiecy == 0) {
            int roznicaDni = obliczRoznice(wybranaDataTab[0], dataUrodzeniaTab[0]);
            if (roznicaDni < 0) {
                wiek--;
            }
        }
        return wiek;
    }

    private static void sprawdzPoprawnoscWieku(int wiek) {
        if (wiek < 0) {
            throw new RuntimeException("Data urodzenia nie moze byc pozniej niz wybrana data.");
        } else if (wiek > 120) {
            throw new RuntimeException("Osoba nie moze miec wiecej niz 120 lat!");
        }
    }

    private static int obliczRoznice(String a, String b) {
        return Integer.parseInt(a) - Integer.parseInt(b);
    }

    private static void sprawdzFormatDat(String dataUrodzenia, String wybranaData) {
        if (!dataUrodzenia.matches(FORMAT_DATY)) {
            throw new RuntimeException("Data urodzenia nie jest poprawna");
        } else if (!wybranaData.matches(FORMAT_DATY)) {
            throw new RuntimeException("Wybrana data nie jest poprawna");
        }
    }
}
