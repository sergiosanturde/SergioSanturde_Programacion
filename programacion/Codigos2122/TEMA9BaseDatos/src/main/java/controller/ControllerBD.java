package controller;

import database.SchemeDB;
import model.Alumno;

import java.sql.*;

public class ControllerBD {

    private Connection conn;

    private PreparedStatement preparedStatement;

    private Statement statement;

    private void getConnection() {
        String host = SchemeDB.URL_SERVER;
        String dtbs = SchemeDB.DB_NAME;
        String user = "root";
        String pass = "admin";
        /*Statement st = conn.createStatement();
        ResultSet rs;
        PreparedStatement ps;*/


        String newConnectionURL = "jdbc:mysql://" + host + "/" + dtbs
                + "?" + "user=" + user + "&password=" + pass;

        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection(newConnectionURL);
            System.out.println(conn.getCatalog());
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private void closeConnection() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertarAlumnoStatement() {
        // INSERT INTO alumnos (nombre,apellido,edad) VALUES ('Sergio','Santurde',20)
        try {
            String nombre = "Pepe", apellido = "faq";
            int edad = 69;
            getConnection();
            statement = conn.createStatement();
            String sql = String.format("INSERT INTO %s (%s,%s,%s) VALUES ('%s','%s',%d)", SchemeDB.TAB_ALU, SchemeDB.COL_NOMBRE, SchemeDB.COL_APELLIDO, SchemeDB.COL_EDAD, nombre, apellido, edad);
            int numeroRow = statement.executeUpdate(sql);
            System.out.println(numeroRow);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            closeConnection();
        }
    }

    public void insertarAlumno(Alumno alumno) {

        String nombre = alumno.getNombre();
        String apellido = alumno.getApellido();
        int edad = alumno.getEdad();

        try {
            getConnection();
            statement = conn.createStatement();
            String sql = String.format("INSERT INTO %s (%s,%s,%s) VALUES ('%s','%s',%d)", SchemeDB.TAB_ALU, SchemeDB.COL_NOMBRE, SchemeDB.COL_APELLIDO, SchemeDB.COL_EDAD, nombre, apellido, edad);
            int numeroRow = statement.executeUpdate(sql);
            System.out.println(numeroRow);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            closeConnection();
        }

    }

    public void insertarAlumnoPrepare() {
        String nombre = "Borja";
        String apellido = "Martín";
        int edad = 38;
        String query = "INSERT INTO alumnos (nombre,apellido,edad) VALUES (?,?,?)";

        try {
            getConnection();
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, nombre);
            preparedStatement.setString(2, apellido);
            preparedStatement.setInt(3, edad);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            closeConnection();
        }


    }

    public void modificarUser(int edad,String nombre) {

        String query = String.format("UPDATE %s SET %s = ? where %s = ?", SchemeDB.TAB_ALU, SchemeDB.COL_EDAD, SchemeDB.COL_NOMBRE);

        try {
            getConnection();
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setInt(1, edad);
            preparedStatement.setString(2, nombre);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            closeConnection();
        }
    }
}
