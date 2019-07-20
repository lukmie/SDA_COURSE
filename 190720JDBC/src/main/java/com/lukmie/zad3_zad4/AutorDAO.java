package com.lukmie.zad3_zad4;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AutorDAO {

    private DBProperties dbProperties = new DBProperties();
    private KsiazkaDAO ksiazkaDAO = new KsiazkaDAO();
    private Ksiazka ksiazkaDB;
    //private Autor autorDB = new Autor();
    private String insertAutor = "INSERT INTO autor(`imie`, `nazwisko`) VALUES (?,?)";
    private String selectAutorByNameAndSurname = "SELECT id FROM autor WHERE `imie` = ? AND `nazwisko` = ?;";
    private String asignAutorToBook = "INSERT INTO autor_ksiazka(`idautor`, `ksiazka`) VALUES (?,?)";
    private String selectBooksByAuthor = "SELECT id, tytul FROM ksiazka JOIN autor_ksiazka ON ksiazka.id = autor_ksiazka.ksiazka WHERE idautor=?;";
    private String checkMatch = "SELECT id, tytul FROM ksiazka JOIN autor_ksiazka ON ksiazka.id = autor_ksiazka.ksiazka WHERE idautor=? AND id=?;";

    public void newAutor(Autor tempAutor) {
        try (Connection connection = DriverManager.getConnection(dbProperties.getUrl(), dbProperties.getUser(), dbProperties.getPassword());
             //Statement stmt = connection.createStatement();
             PreparedStatement preStmt1 = connection.prepareStatement(insertAutor);) {

            preStmt1.setString(1, tempAutor.getImie());
            preStmt1.setString(2, tempAutor.getNazwisko());
            int i = preStmt1.executeUpdate();
            System.out.println("Dodano " + i + " pozycji." );

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void asignAutorToBook(Autor tempAutor, Ksiazka tempKsiazka) {
        try (Connection connection = DriverManager.getConnection(dbProperties.getUrl(), dbProperties.getUser(), dbProperties.getPassword());
             PreparedStatement preStmt4 = connection.prepareStatement(asignAutorToBook);) {

            preStmt4.setInt(1, findByFirstNameAndLastName(tempAutor.getImie(),tempAutor.getNazwisko()));
            preStmt4.setInt(2, ksiazkaDAO.findByTitle(tempKsiazka.getTytul()));
            preStmt4.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Integer findByFirstNameAndLastName(String firstName, String lastName) {
        Integer id = null;
        try (   Connection connection = DriverManager.getConnection(dbProperties.getUrl(), dbProperties.getUser(), dbProperties.getPassword());
                //Statement stmt = connection.createStatement();
                PreparedStatement preStmt1 = connection.prepareStatement(selectAutorByNameAndSurname);) {

            preStmt1.setString(1, firstName);
            preStmt1.setString(2, lastName);
            ResultSet resultSet = preStmt1.executeQuery();
            resultSet.next();
            id = resultSet.getInt("id");
            System.out.println(id);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return id;
    }

    public List<Ksiazka> showBooksByAutor(Integer theId) {
        List<Ksiazka> list = new ArrayList<>();
        try (   Connection connection = DriverManager.getConnection(dbProperties.getUrl(), dbProperties.getUser(), dbProperties.getPassword());
//                Statement stmt = connection.createStatement();
                PreparedStatement preStmt5 = connection.prepareStatement(selectBooksByAuthor);) {

//            preStmt1.execute();
            preStmt5.setInt(1, theId);
            ResultSet resultSet = preStmt5.executeQuery();
            while (resultSet.next()) {
                ksiazkaDB = new Ksiazka();
                ksiazkaDB.setId(resultSet.getInt("id"));
                ksiazkaDB.setTytul(resultSet.getString("tytul"));
                list.add(ksiazkaDB);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        list.forEach(System.out::println);
        return list;
    }

    public boolean checkMatch(Integer autorId, Integer ksiazkaId) {
        List<Ksiazka> list = new ArrayList<>();
        try (   Connection connection = DriverManager.getConnection(dbProperties.getUrl(), dbProperties.getUser(), dbProperties.getPassword());
//                Statement stmt = connection.createStatement();
                PreparedStatement preStmt5 = connection.prepareStatement(checkMatch);) {

//            preStmt1.execute();
            preStmt5.setInt(1, autorId);
            preStmt5.setInt(2, ksiazkaId);
            ResultSet resultSet = preStmt5.executeQuery();
            while (resultSet.next()) {
                ksiazkaDB = new Ksiazka();
                ksiazkaDB.setId(resultSet.getInt("id"));
                ksiazkaDB.setTytul(resultSet.getString("tytul"));
                list.add(ksiazkaDB);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        list.forEach(System.out::println);
        return !list.isEmpty();
    }


}
