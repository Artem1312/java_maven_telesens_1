package com.academy.telesens.lesson_12.home_task;

import java.sql.*;

public class DemoAddPhoneNumber {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mobile?user=root&password=Bonk2021";
        String sqlInsert = "INSERT INTO mobile.subscriber\n" +
                "\n" +
                "(mobile.subscriber.subscriber_id, mobile.subscriber.last_name, mobile.subscriber.first_name, mobile.subscriber.gender, age)\n" +
                "\n" +
                "VALUES (8,'Сидоров', 'Петр','m', 42);";

        try (Connection conn = DriverManager.getConnection(url)) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Statement statement = conn.createStatement();
            statement.executeUpdate(sqlInsert);

            //PreparedStatement preparedStatement = conn.prepareStatement(sqlInsertTemplate);
//            preparedStatement.setInt(1, 9);
//
//            preparedStatement.setString(2, "demo_firstName_2");
//            preparedStatement.setString(3, "demo_lastName_2");
//            preparedStatement.setString(4, "f");
//            preparedStatement.setInt(5, 26);
//            preparedStatement.executeUpdate();
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
