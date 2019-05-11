package com.lukmie.zad3;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MalformedURLException, FileNotFoundException {

        Gson gson = new Gson();

        Map<String, String> jokes = new HashMap<>(10);

        while (jokes.size() < 10){
            String json = jsonGetRequest("https://api.chucknorris.io/jokes/random");
            Joke joke = gson.fromJson(json, Joke.class);
            jokes.put(joke.getId(), joke.getValue());
        }

        for (Map.Entry entry : jokes.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
    }

    private static String streamToString(InputStream inputStream) {
        String text = new Scanner(inputStream, "UTF-8").useDelimiter("\\Z").next();
        return text;
    }

    public static String jsonGetRequest(String urlQueryString) throws MalformedURLException {
        String json = null;
        try {
            URL url = new URL(urlQueryString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoOutput(true);
            connection.setInstanceFollowRedirects(false);
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("charset", "utf-8");
            connection.setRequestProperty("user-agent", "chrome");
            connection.connect();
            InputStream inStream = connection.getInputStream();
            json = streamToString(inStream); // input stream to string
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return json;
    }
}
