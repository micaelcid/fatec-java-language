package student;

import database.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;

public class StudentDAO {
    private Connection connection;

    public StudentDAO() {
        try {
            connection = ConnectionFactory.getConnection();
        } catch(SQLException e) {
            System.out.println("Database Connection Failed. " + e);
        } catch(ClassNotFoundException e) {
            System.out.println("Database Connection Failed. " + e);
        }
    }

    public void createTable() throws SQLException{
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(
                "CREATE TABLE IF NOT EXISTS student(" +
                    "id SERIAL PRIMARY KEY," +
                    "name VARCHAR(255)," +
                    "code VARCHAR(13)," +
                    "location VARCHAR(255)" +
                ")"
            );

            if(preparedStatement.execute()) {
                System.out.println("Table successfully created.");
            } else {
                System.out.println("Table failed to be created.");
            }
        } catch (SQLException e) {
            System.out.println("Database Connection Failed. " + e);
        }
    }

    public void create(Student student) throws SQLException{
        PreparedStatement preparedStatement = connection.prepareStatement(
            "INSERT INTO student(name, code, location) VALUES(?, ?, ?)"
        );
        preparedStatement.setString(1, student.getName());
        preparedStatement.setString(2, student.getCode());
        preparedStatement.setString(3, student.getLocation());

        if(preparedStatement.execute()) {
            System.out.println("User successfully created.");
        } else {
            System.out.println("User failed to be created.");
        }
    }

    public void getAll() throws SQLException{
        PreparedStatement preparedStatement = connection.prepareStatement(
            "SELECT * FROM student"
        );

        ArrayList<Student> students = new ArrayList<Student>();
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()) {
            Student student = new Student(
                resultSet.getInt("id"),
                resultSet.getString("name"),
                resultSet.getString("code"),
                resultSet.getString("location")
            );
            students.add(student);

            System.out.println("------------------------------------");
            System.out.println("ID: " + student.getId());
            System.out.println("Name:  " + student.getName());
            System.out.println("Code:  " + student.getCode());
            System.out.println("Location:  " + student.getLocation());
        }
    }

    public void update(Student student) throws SQLException{
        PreparedStatement preparedStatement = connection.prepareStatement(
            "UPDATE student SET name=?, code=?, location=? WHERE id=?"
        );
        preparedStatement.setString(1, student.getName());
        preparedStatement.setString(2, student.getCode());
        preparedStatement.setString(3, student.getLocation());
        preparedStatement.setString(4, Integer.toString(student.getId()));

        if(preparedStatement.execute()) {
            System.out.println("User successfully updated.");
        } else {
            System.out.println("User failed to be updated.");
        }
    }

    public void update(int id) throws SQLException{
        PreparedStatement preparedStatement = connection.prepareStatement(
            "DELETE FROM student WHERE id=?"
        );
        preparedStatement.setString(1, Integer.toString(id));

        if(preparedStatement.execute()) {
            System.out.println("User successfully updated.");
        } else {
            System.out.println("User failed to be updated.");
        }
    }
}
