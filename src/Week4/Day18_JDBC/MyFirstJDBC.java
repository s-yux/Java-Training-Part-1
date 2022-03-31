package Week4.Day18_JDBC;

import oracle.jdbc.OracleDriver;

import java.sql.*;
import java.util.Arrays;
import java.util.Scanner;

public class MyFirstJDBC {

    public static void main(String[] args) {

        Connection con;
        Statement stmt;
        PreparedStatement pstmt;
        ResultSet res;

        try {
            DriverManager.registerDriver(new OracleDriver());
            System.out.println("Driver is registered successfully!");

            con = DriverManager.getConnection("jdbc:oracle:thin:@//127.0.0.1:1521/XE", "SYSTEM", "root");
            System.out.println("Connection established!");

//            //READ
//            stmt = con.createStatement();
//            res = stmt.executeQuery("SELECT * FROM STUDENT WHERE id=2");

//            pstmt = con.prepareStatement("SELECT * FROM STUDENT WHERE id=2");
////            Scanner sc = new Scanner(System.in);
////            System.out.println("Enter ID of student:");
////            int temp = sc.nextInt();
////            pstmt.setInt(1, temp);
//            res = pstmt.executeQuery();

//            while (res.next()) {
//                int id = res.getInt(1);
//                String name = res.getString(2);
//                int marks1 = res.getInt(3);
//                int marks2 = res.getInt(4);
//                int marks3 = res.getInt(5);
//                System.out.println(id + ", " + name + ", " + marks1 + ", " + marks2 + ", " + marks3);
//            }

//            //Check col name and type
//            ResultSetMetaData rsmd = res.getMetaData();
//            for(int i=1; i<rsmd.getColumnCount(); i++){
//                System.out.println(rsmd.getColumnName(i) + ", " + rsmd.getColumnTypeName(i));
//            }

//            //UPDATE
//            pstmt = con.prepareStatement("UPDATE STUDENT SET marks1=? WHERE id=?");
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter marks1 to be updated");
//            int temp1 = sc.nextInt();
//            System.out.println("Enter ID of student");
//            int temp2 = sc.nextInt();
//
//            pstmt.setInt(1, temp1);
//            pstmt.setInt(2, temp2);
//
//            System.out.println(pstmt.executeUpdate());

//            //DELETE
//            pstmt = con.prepareStatement("DELETE FROM STUDENT WHERE id=?");
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter ID of student");
//            int temp = sc.nextInt();
//
//            pstmt.setInt(1, temp);
//            System.out.println(pstmt.executeUpdate());

//            //INSERT
//            pstmt = con.prepareStatement("INSERT INTO STUDENT (id, name, marks1, marks2, marks3) VALUES (?,?,?,?,?)");
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter ID of student");
//            int temp1 = sc.nextInt();
//            System.out.println("Enter name of student");
//            String temp2 = sc.next();
//            System.out.println("Enter marks1 of student");
//            int temp3 = sc.nextInt();
//            System.out.println("Enter marks2 of student");
//            int temp4 = sc.nextInt();
//            System.out.println("Enter marks3 of student");
//            int temp5 = sc.nextInt();
//
//            pstmt.setInt(1, temp1);
//            pstmt.setString(2, temp2);
//            pstmt.setInt(3, temp3);
//            pstmt.setInt(4, temp4);
//            pstmt.setInt(5, temp5);
//
//            System.out.println(pstmt.executeUpdate());

//            //UPDATE only when user tells you to (Integrity issue)
//            con.setAutoCommit(false);       //Don't make any changes until i tell you to.
//
//            pstmt = con.prepareStatement("UPDATE STUDENT SET marks1=? WHERE id=?");
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter ID of student");
//            int id1 = sc.nextInt();
//            System.out.println("Enter marks");
//            int marks1 = sc.nextInt();
//            pstmt.setInt(1, marks1);
//            pstmt.setInt(2, id1);
//
//            pstmt.executeUpdate();
//
//            System.out.println("Enter ID of student");
//            int id2 = sc.nextInt();
//            System.out.println("Enter marks");
//            int marks2 = sc.nextInt();
//            pstmt.setInt(1, marks2);
//            pstmt.setInt(2, id2);
//
//            pstmt.executeUpdate();
//
//            con.commit();       //Only this will "execute" all the SQL queries in case something happen halfway.

            pstmt = con.prepareStatement("UPDATE STUDENT SET marks1=? WHERE id=?");
            pstmt.setInt(1, 10);
            pstmt.setInt(2, 1);
            pstmt.addBatch();
            pstmt.setInt(1, 20);
            pstmt.setInt(2, 2);
            pstmt.addBatch();
            pstmt.setInt(1, 30);
            pstmt.setInt(2, 3);
            pstmt.addBatch();
            System.out.println(Arrays.toString(pstmt.executeBatch()));

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
