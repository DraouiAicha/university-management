import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UniversityManagement {
    private JPanel Main;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JButton saveButton;
    private JButton deleteButton;
    private JButton updateButton;

    private JButton searchButton;
    private JButton clearFormButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("UniversityManagement");
        frame.setContentPane(new UniversityManagement().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    Connection connection;

    public UniversityManagement() {
        ConnectToDB();

    saveButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int studentID, passOutYear, universityRank;
            String departement, firstName, lastName;
            studentID = Integer.parseInt(textField1.getText());
            departement = textField2.getText();
            firstName = textField3.getText();
            lastName = textField4.getText();
            passOutYear = Integer.parseInt(textField5.getText());
            universityRank = Integer.parseInt(textField6.getText());
            try {
                String sql = "INSERT INTO engineeringstudents (student_id, departement, first_name, last_name, passoutyear, universityrank) VALUES (?, ?, ?, ?, ?, ?)";
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setInt(1, studentID);
                statement.setString(2, departement);
                statement.setString(3, firstName);
                statement.setString(4, lastName);
                statement.setInt(5, passOutYear);
                statement.setInt(6, universityRank);
                statement.executeUpdate();
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
                textField4.setText("");
                textField5.setText("");
                textField6.setText("");
                textField1.requestFocus();
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    });
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int studentID;
                studentID = Integer.parseInt(textField1.getText());
                try {
                    String sql = "DELETE FROM engineeringstudents WHERE student_id=?";
                    PreparedStatement statement = connection.prepareStatement(sql);
                    statement.setInt(1, studentID);
                    statement.executeUpdate();
                    textField1.setText("");
                    textField1.requestFocus();
                }
                catch(Exception exp) {
                    exp.printStackTrace();
                }
            }
        });
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int studentID, passOutYear, universityRank;
                String departement, firstName, lastName;
                studentID = Integer.parseInt(textField1.getText());
                departement = textField2.getText();
                firstName = textField3.getText();
                lastName = textField4.getText();
                passOutYear = Integer.parseInt(textField5.getText());
                universityRank = Integer.parseInt(textField6.getText());
                try {
                    String sql = "UPDATE engineeringstudents SET Departement=?, First_Name=?, Last_Name=?, PassOutYear=?, UniversityRank=? WHERE student_id=?";
                    PreparedStatement statement = connection.prepareStatement(sql);
                    statement.setInt(6, studentID);
                    statement.setString(1, departement);
                    statement.setString(2, firstName);
                    statement.setString(3, lastName);
                    statement.setInt(4, passOutYear);
                    statement.setInt(5, universityRank);
                    statement.executeUpdate();
                    textField1.setText("");
                    textField2.setText("");
                    textField3.setText("");
                    textField4.setText("");
                    textField5.setText("");
                    textField6.setText("");
                    textField1.requestFocus();
                    JOptionPane.showMessageDialog(null,"Record updated successfully");


                }
                catch(Exception exp) {
                    exp.printStackTrace();
                }
            }
        });
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int studentID;
                studentID = Integer.parseInt(textField1.getText());
                try {
                    String sql = "SELECT  *  FROM engineeringstudents WHERE student_id=?";
                    PreparedStatement statement = connection.prepareStatement(sql);
                    statement.setInt(1, studentID);
                    ResultSet resultSet = statement.executeQuery();
                    if(resultSet.next()) {
                        String departement = resultSet.getString(2);
                        String firstName = resultSet.getString(3);
                        String lastName = resultSet.getString(4);
                        int passOutYear = resultSet.getInt(5);
                        int universityRank = resultSet.getInt(6);
                        textField2.setText(departement);
                        textField3.setText(firstName);
                        textField4.setText(lastName);
                        textField5.setText(String.valueOf(passOutYear));
                        textField6.setText(String.valueOf(universityRank));
                    }
                    else {
                        textField1.setText("");
                        textField2.setText("");
                        textField3.setText("");
                        textField4.setText("");
                        textField5.setText("");
                        textField6.setText("");
                        textField1.requestFocus();
                        JOptionPane.showMessageDialog(null,"Invalid student ID");
                    }

                }
                catch(Exception exp) {
                    exp.printStackTrace();
                }
            }
        });
        clearFormButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
                textField4.setText("");
                textField5.setText("");
                textField6.setText("");
                textField1.requestFocus();
            }
        });
    }
    public void ConnectToDB() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "");
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
