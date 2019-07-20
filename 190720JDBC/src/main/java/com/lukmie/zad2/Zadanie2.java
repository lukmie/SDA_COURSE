package com.lukmie.zad2;

import java.sql.*;

public class Zadanie2 {
    private final static String sqlSelect = "SELECT * FROM uzytkownik ";
    private final static String sqlSelectMaxId = "SELECT MAX(id) FROM uzytkownik ";
    private final static String sqlInsert = "INSERT INTO uzytkownik" + "(`imie`, `nazwisko`)" + "VALUES(?,?)";
    private final static String sqlUpdate = "UPDATE uzytkownik " + "SET `nazwisko` = ? " + "WHERE `id` = ?";

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/ksiegarnia?serverTimezone=UTC";
        String user = "sdatest";
        String password = "Start123!";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement stmt = connection.createStatement();
             PreparedStatement preStmt1 = connection.prepareStatement(sqlInsert);
             PreparedStatement preStmt2 = connection.prepareStatement(sqlSelectMaxId);
             PreparedStatement preStmt3 = connection.prepareStatement(sqlUpdate);) {

//            a)
//            printTable(stmt);

//            b)
//            preStmt1.setString(1, "Andrzej");
//            preStmt1.setString(2, "Nowak");
//            preStmt1.execute(); // lub
//            int iloscZmienionychRekordow = preStmt1.executeUpdate();

//            c)
//            printTable(stmt);

//            d)
//            Szukanie maxa przy pomocy preparedStatement:
//            ResultSet resultSet2 = preStmt2.executeQuery();
//            resultSet2.next();
//            System.out.println(resultSet2.getInt(1));

//            Szukanie maxa przy pomocy statement:
            ResultSet resultSet = stmt.executeQuery(sqlSelectMaxId);
            resultSet.next();
            Integer maxId = resultSet.getInt(1);

            preStmt3.setString(1, "Lewandowski");
            preStmt3.setInt(2, maxId);
            preStmt3.execute();

            printTable(stmt);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void printTable(Statement stmt) throws SQLException {
        ResultSet resultSet = stmt.executeQuery(sqlSelect);
        while (resultSet.next()) {
            Integer id = resultSet.getInt("id");
            String imie = resultSet.getString("imie");
            String nazwisko = resultSet.getString("nazwisko");
            System.out.println("użytkownik: " + id + " " + imie + " " + nazwisko);
        }
    }
}
