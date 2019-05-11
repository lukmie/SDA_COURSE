package com.lukmie.zad2;

import com.detectlanguage.DetectLanguage;
import com.detectlanguage.Result;
import com.detectlanguage.errors.APIError;

import java.io.*;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException, APIError {
        DetectLanguage.apiKey = "bdb6299ef9f486f4d393b0f65b3837bb";

        BufferedReader br = new BufferedReader(new FileReader("chunichi.txt"));
        String everything;
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            everything = sb.toString();
        } finally {
            br.close();
        }

        List<Result> results = DetectLanguage.detect(everything);

        Result result = results.get(0);
        Locale.setDefault(Locale.forLanguageTag("english"));

        System.out.println("Language: " + Locale.forLanguageTag(result.language).getDisplayLanguage());
        System.out.println("Is reliable: " + result.reliable);
        System.out.println("Confidence: " + result.confidence);
    }
}
