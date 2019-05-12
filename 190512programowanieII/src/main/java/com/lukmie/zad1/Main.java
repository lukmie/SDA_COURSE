package com.lukmie.zad1;

import com.google.gson.Gson;
import net.gpedro.integrations.slack.SlackApi;
import net.gpedro.integrations.slack.SlackAttachment;
import net.gpedro.integrations.slack.SlackMessage;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedImage image;

        for (int i = 1; i <= 6; i++) {
            Photo photo = downloadPhoto();
            System.out.println(photo.getFile());
            URL url = new URL(photo.getFile());

            String stringURL = url.toString();
            System.out.println(stringURL.lastIndexOf("."));

            image = ImageIO.read(url);

            SlackApi api = new SlackApi("https://hooks.slack.com/services/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");
            SlackAttachment slackAttachment = new SlackAttachment("fail");
            slackAttachment.setImageUrl(url.toString());
            SlackMessage slackMessage = new SlackMessage("hello");
            slackMessage.addAttachments(slackAttachment);
            api.call(slackMessage);


            String format = stringURL.substring(stringURL.lastIndexOf("."));
            String pathName = "src/main/resources/kot_" + i + format;
            System.out.println(image.getData());
            ImageIO.write(image, format.replace(".",""), new File(pathName));
            System.out.println(new File(pathName).length()/1024 + "KB");
        }

    }
    private static Photo downloadPhoto() throws IOException {
        String link = "https://aws.random.cat/meow";
        URL url = new URL(link);

        URLConnection connection = url.openConnection();
        connection.setRequestProperty("User-Agent", "Chrome");
        Scanner scanner = new Scanner(connection.getInputStream());

        String line = scanner.nextLine();

        Gson gson = new Gson();
        return gson.fromJson(line, Photo.class);
    }
}
