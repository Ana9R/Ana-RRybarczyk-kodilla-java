package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManagerTestSuite {
    @Test
    public void testConnect() throws SQLException {
        //Given

        //When
        DbManager dbManager = DbManager.getInstance();

        //Then
        Assert.assertNotNull(dbManager.getConnection());
    }

    @Test
    public void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        Assert.assertEquals(5, counter);
    }

    @Test
    public void testSelectUsersAndPosts() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        Connection connection = dbManager.getConnection();
        Statement statement = connection.createStatement();
        String sqlQuery = "select U.FIRSTNAME, U.LASTNAME, count(*) AS POST_NUMBER " +
                "FROM users U, issues I " +
                "WHERE U.ID = I.USER_ID_ASSIGNEDTO " +
                "group by USER_ID_ASSIGNEDTO " +
                "HAVING COUNT(*) > 1;";

        //When
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getString("FIRSTNAME") + "," +
                    rs.getString("LASTNAME"));
        counter++;
        }
        rs.close();
        statement.close();
        Assert.assertEquals(4, counter);
    }
}
