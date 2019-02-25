package lab9;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

class Employee{
    public Employee(int id, String name, String position, double salary) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private int id;
    private String name;
    private String position;
    private double salary;

    //constructor
}

public class TestJDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //step 1
        Class.forName("org.sqlite.JDBC");
        System.out.println("Load Driver successfully.");

        //step 2
        String SQCONN = "jdbc:sqlite:D:/OOP358411110062/src/company.sqlite";
        Connection conn = null;
        try {
            conn= DriverManager.getConnection(SQCONN);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (conn == null){
            System.out.println("could not connect to DB.");
        }else {
            System.out.println("Connected to DB.");
        }
        //step 3 :
        Statement stmt = conn.createStatement();
        String sgl = "select * from employee";
        ResultSet rs = stmt.executeQuery(sgl);

        //step 4
        List<Employee>emp=new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt(1);
            String name = rs.getString(2);
            String position = rs.getString(3);
            double salary = rs.getDouble(4);
 //           System.out.println("ID :"+id);
 //           System.out.println("Name :"+name);
 //           System.out.println("Position :"+position);
 //           System.out.println("Salary :"+salary);
 //          System.out.println("--------------------------");

            emp.add(new Employee(id, name, position, salary));


        }



        //step 5
        rs.close();
        stmt.close();
        conn.close();

        //viewing data via object
        for (Employee e:emp){
            System.out.println("ID: " +e.getId());
            System.out.println("Name: " +e.getName());
            System.out.println(e.toString());
        }

    }





}
