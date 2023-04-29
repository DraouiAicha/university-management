import java.sql.*;

public class MyJDBC {
    public static void main(String[] args) {
        /*
        // first
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from engineeringstudents");
            while(resultSet.next()) {
                System.out.println(resultSet.getString("First_name"));
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }


        // second
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from engineeringstudents");
            while(resultSet.next()) {
                String universityData = "";
                for(int i = 1; i <= 6; i++) {
                    universityData += resultSet.getString(i)+"-";
                }
                System.out.println(universityData);
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }

         */
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from engineeringstudents where departement='CS'");
            while(resultSet.next()) {
                String universityData = "";
                for(int i = 1; i <= 6; i++) {
                    universityData += resultSet.getString(i)+"-";
                }
                System.out.println(universityData);
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
