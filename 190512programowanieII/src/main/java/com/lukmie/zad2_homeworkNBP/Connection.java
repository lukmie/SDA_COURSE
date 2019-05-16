package com.lukmie.zad2_homeworkNBP;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Connection {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public String createURL(Table table, String nationality, long daysAgo){

        StringBuilder sb = new StringBuilder("http://api.nbp.pl/api/exchangerates/rates");
        sb.append("/" + table);
        sb.append("/" + nationality);
        sb.append("/" + Operations.checkDate(LocalDateTime.now().minusDays(daysAgo)).format(FORMATTER));
        sb.append("/?format=json").toString();
        return sb.toString();
    }


    public Currency getJsonFromURL(Table table, String nationality, long daysAgo)  {

        URL url;
        Scanner scanner = null;
        try {
            url = new URL(createURL(table, nationality, daysAgo));
            scanner = new Scanner(url.openConnection().getInputStream());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String line = scanner.nextLine();

        Gson gson = new Gson();

        return gson.fromJson(line, Currency.class);
    }
}
