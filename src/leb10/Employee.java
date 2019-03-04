package leb10;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

class Empoloyee{
    private int id;

    public Empoloyee(int id, String name, String position, double salary) {
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

    private String name;
    private String position;
    private double salary;
}//Empoloyee

//constructor



public class TestJDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        System.out.print("Load driver successfully.");

        //step 2
        String SQCONN = "jdbc:sqlite:D:/OOP358411110067/src/company.sqlite";
        Connection conn = null;
        try {
            conn=DriverManager.getConnection(SQCONN);
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
        String sql = "select * from employee";
        ResultSet rs = stmt.executeQuery(sql);

        //step 4: viewing data
        List<lab9.Empoloyee>emp= new ArrayList<>();
        while (rs.next()){
            int id = rs.getInt(1);
            String name = rs.getString(2);
            String position = rs.getString(3);
            double salary = rs.getDouble(4);
//            System.out.println("ID: " +id);
//            System.out.println("Name: " +name);
//            System.out.println("Position: " +position);
//            System.out.println("Salary: " +salary);
//            System.out.println("-----------------------------------");


            emp.add(new lab9.Empoloyee(id,name,position,salary));
        }

        //step 5: close connection
        rs.close();
        stmt.close();
        conn.close();


        //viewing data via object
        for (lab9.Empoloyee e:emp){
            System.out.println("ID: " +e.getId());
            System.out.println("Name: " +e.getName());
            System.out.println("position: " +e.getPosition());
            System.out.println("Salary: " +e.getSalary());
        }

    }//main
}//class

