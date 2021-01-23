package com.academy.telesens.lesson_12;

import com.academy.telesens.util.PropertiesProvider;

import java.sql.*;

public class DemoMySQL {
    public static void main(String[] args) {

        String dburl2 = PropertiesProvider.get("db.url");
        System.out.println(dburl2);
        String test = PropertiesProvider.get("demo.test");
        System.out.println(test);

        String url = PropertiesProvider.get("db.url");
        //String url = "jdbc:mysql://localhost:3306/mobile?user=root&password=Bonk2021";
        //String url = "jdbc:mysql://localhost:3306/mobile?user=root&password=Bonk2021";
        String sqlInsert = "INSERT INTO mobile.subscriber\n" +
                "\n" +
                "(mobile.subscriber.subscriber_id, mobile.subscriber.last_name, mobile.subscriber.first_name, mobile.subscriber.gender, age)\n" +
                "\n" +
                "VALUES (9,'Сидоров', 'Петр','m', 42);";

        String sqlInsertTemplate = "INSERT INTO mobile.subscriber\n" +
                "\n" +
                "(mobile.subscriber.subscriber_id, mobile.subscriber.last_name, mobile.subscriber.first_name, mobile.subscriber.gender, age)\n" +
                "\n" +
                "VALUES (?,?,?,?,?);";
        try (Connection conn = DriverManager.getConnection(url)) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Statement statement = conn.createStatement();
            statement.executeUpdate(sqlInsert);

            PreparedStatement preparedStatement = conn.prepareStatement(sqlInsertTemplate);
            preparedStatement.setInt(1, 9);

            preparedStatement.setString(2, "demo_firstName_2");
            preparedStatement.setString(3, "demo_lastName_2");
            preparedStatement.setString(4, "f");
            preparedStatement.setInt(5, 26);
            preparedStatement.executeUpdate();
            // Прочитаем полностью таблицу subscriber
            Statement readStatement = conn.createStatement();
            ResultSet resultSet = readStatement.executeQuery("SELECT * FROM subscriber");

            while (resultSet.next()) {
                int id = resultSet.getInt("subscriber_id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                String gender = resultSet.getString("gender");
                int age = resultSet.getInt("age");
                System.out.println(String.format("%d | %s | %s | %s | %d",
                        id, firstName, lastName, gender, age));


            }
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
    }
}
