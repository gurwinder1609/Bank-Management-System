package bank.management.system;

import java.sql.*;
public class Conc {
    Connection connection;
    Statement statement;
    public Conc() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/banksystem ","root","billy");
            statement = connection.createStatement();


        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
