package controller;

import database.SchemaBD;

import java.sql.*;

public class GestionBD {

    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;

    private void iniciarBD(){
        String host = SchemaBD.URL_SERVER;
        String dtbs = SchemaBD.DB_NAME;
        String user = "root";
        String pass = "admin";



        String newConnectionURL = "jdbc:mysql://" + host + "/" + dtbs
                + "?" + "user=" + user + "&password=" + pass;
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            connection = (Connection) DriverManager.getConnection(newConnectionURL);
            System.out.println(connection.getCatalog());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void cerrarBD(){
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void insertarPerfil(){
        iniciarBD();
        try {
            statement = connection.createStatement();
            String sql1 = String.format("INSERT INTO %s (%s) VALUES ('%s','%s')",SchemaBD.TAB_PERF,SchemaBD.COL_NOMBRE_PERF,"trabajador");
            String sql2 = String.format("INSERT INTO %s (%s) VALUES ('%s','%s')",SchemaBD.TAB_PERF,SchemaBD.COL_NOMBRE_PERF,"director");
            String sql3 = String.format("INSERT INTO %s (%s) VALUES ('%s','%s')",SchemaBD.TAB_PERF,SchemaBD.COL_NOMBRE_PERF,"gerente");
            int numeroRow1 = statement.executeUpdate(sql1);
            int numeroRow2 = statement.executeUpdate(sql2);
            int numeroRow3 = statement.executeUpdate(sql3);
            System.out.println(numeroRow1);
            System.out.println(numeroRow2);
            System.out.println(numeroRow3);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            cerrarBD();
        }
    }

}