import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringRegex {
    public static void main(String[] args) {
        String informacje = "Marian Kowalski 600-625-420 80-422 Sopot";
        String pattern = "([a-zA-Z]+)\\s+([a-zA-Z]+)\\s+([0-9\\-]{9,12})\\s([0-9\\-]{6})\\s([a-zA-Z]{2,})";

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(informacje);

        if (m.find( )) {

            System.out.println("Imie : " + m.group(1) );

            System.out.println("Nazwisko : " + m.group(2) );
            System.out.println("Telefon : " + m.group(3) );
            System.out.println("Kod pocztowy : " + m.group(4) );
            System.out.println("Miasto : " + m.group(5) );
        }else {
            System.out.println("Nie udalo sie znalezc poszukiwanych informacji");
        }
    }

}