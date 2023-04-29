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


        // third
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


        // fourth
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","");
            String sql = "INSERT INTO engineeringstudents (student_id, departement, first_name, last_name, passoutyear, universityrank) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, 156);
            statement.setString(2, "Cloud");
            statement.setString(3, "John");
            statement.setString(4, "Mx");
            statement.setInt(5, 2025);
            statement.setInt(6, 9);
            statement.executeQuery();
            System.out.println("Record inserted successfully.");

        }
        catch (Exception e) {
            e.printStackTrace();
        }


        // 5
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","");
            String sql = "UPDATE engineeringstudents SET departement='Devops' WHERE student_id=156";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.executeUpdate();
            System.out.println("Record updated successfully.");

        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }


        // 6
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "");
            String sql = "DELETE FROM engineeringstudents WHERE student_id=?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, 156);
            statement.executeUpdate();
            System.out.println("Record deleted successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }

         */
    }}


