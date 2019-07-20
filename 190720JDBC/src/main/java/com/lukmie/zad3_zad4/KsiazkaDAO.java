package com.lukmie.zad3_zad4;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class KsiazkaDAO {

    private DBProperties dbProperties = new DBProperties();
    private Ksiazka ksiazkaDB = new Ksiazka();

    private String selectById = "SELECT * FROM ksiazka WHERE `id` = ?;";
    private String insertBook = "INSERT INTO ksiazka(`tytul`) VALUES (?)";
    private String updateBookById = "UPDATE ksiazka SET `tytul` = ? WHERE `id` = ?;";
    private String deleteBookById = "DELETE FROM ksiazka WHERE `id`=?;";
    private String selectAllBooks = "SELECT * FROM ksiazka";
    private String selectMaxId = "SELECT MAX(id) FROM ksiazka;";
    private String updateLastRow = "UPDATE ksiazka SET `tytul` = ? WHERE `id` = ?";
    private String selectBookIdByTitle = "SELECT id FROM ksiazka WHERE `tytul` = ?;";

    public Ksiazka findById(Integer id) {
        try (   Connection connection = DriverManager.getConnection(dbProperties.getUrl(), dbProperties.getUser(), dbProperties.getPassword());
                //Statement stmt = connection.createStatement();
                PreparedStatement preStmt1 = connection.prepareStatement(selectById);) {

            preStmt1.setInt(1, id);

            ResultSet resultSet = preStmt1.executeQuery();
            while (resultSet.next()) {
                ksiazkaDB.setId(resultSet.getInt("id"));
                ksiazkaDB.setTytul(resultSet.getString("tytul"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ksiazkaDB;
    }

    public void newBook(Ksiazka ksiazka) {
        try (   Connection connection = DriverManager.getConnection(dbProperties.getUrl(), dbProperties.getUser(), dbProperties.getPassword());
                //Statement stmt = connection.createStatement();
                PreparedStatement preStmt2 = connection.prepareStatement(insertBook);) {

            preStmt2.setString(1, ksiazka.getTytul());
            int i = preStmt2.executeUpdate();
            System.out.println("Dodano " + i + " pozycji." );

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean updateById(Integer id, String nowyTytul) {
        int i = 0;
        try (   Connection connection = DriverManager.getConnection(dbProperties.getUrl(), dbProperties.getUser(), dbProperties.getPassword());
                //Statement stmt = connection.createStatement();
                PreparedStatement preStmt3 = connection.prepareStatement(updateBookById);) {

            preStmt3.setString(1, nowyTytul);
            preStmt3.setInt(2, id);
            i = preStmt3.executeUpdate();
            System.out.println("Zaktualizowano " + i + " pozycji." );

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i >0;

    }

    public boolean deleteById(Integer id) {
        int execute = 0;
        try (   Connection connection = DriverManager.getConnection(dbProperties.getUrl(), dbProperties.getUser(), dbProperties.getPassword());
                //Statement stmt = connection.createStatement();
                PreparedStatement preStmt4 = connection.prepareStatement(deleteBookById);) {


            preStmt4.setInt(1, id);
            preStmt4.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return execute > 0;
    }

    public List<Ksiazka> showAllBooks() {
        List<Ksiazka> list = new ArrayList<>();
        try (   Connection connection = DriverManager.getConnection(dbProperties.getUrl(), dbProperties.getUser(), dbProperties.getPassword());
//                Statement stmt = connection.createStatement();
                PreparedStatement preStmt5 = connection.prepareStatement(selectAllBooks);) {

//            preStmt1.execute();

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

    public int getMaxId() {
        int i = 0;
        try (   Connection connection = DriverManager.getConnection(dbProperties.getUrl(), dbProperties.getUser(), dbProperties.getPassword());
                Statement stmt = connection.createStatement();) {

//            preStmt1.execute();

            ResultSet resultSet = stmt.executeQuery(selectMaxId);
            resultSet.next();
            i = resultSet.getInt(1);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    public void updateLastRow() {
        try (   Connection connection = DriverManager.getConnection(dbProperties.getUrl(), dbProperties.getUser(), dbProperties.getPassword());
//                Statement stmt = connection.createStatement();
                PreparedStatement preStmt6 = connection.prepareStatement(updateLastRow);) {

//            preStmt1.execute();

            preStmt6.setString(1, "naklad wyczerpany");
            preStmt6.setInt(2, getMaxId());
            preStmt6.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Integer findByTitle(String title) {
        Integer id = null;
        try (   Connection connection = DriverManager.getConnection(dbProperties.getUrl(), dbProperties.getUser(), dbProperties.getPassword());
                //Statement stmt = connection.createStatement();
                PreparedStatement preStmt1 = connection.prepareStatement(selectBookIdByTitle);) {

            preStmt1.setString(1, title);
            ResultSet resultSet = preStmt1.executeQuery();
            resultSet.next();
            id = resultSet.getInt("id");

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return id;
    }

}
