package Lab10;

import lab8.Employee;

import java.util.List;

public class DAOApp {
    private static void main(String[] args) {

        Lab10.empDAOImpl dao = Lab10.empDAOImpl.getInstant();

        //GET_ALL_EMP
        List<Employee> allEmp = dao.getALLEmp();

        System.out.println("-----Data in Database----");
        for (Employee emp : dao.getALLEmp()) {
            System.out.println(emp.toString());
        }
        System.out.println("-------------------");

        //ADD_EMP
        Employee newEmp = new Employee(
                104,
                "tiw",
                "office",
                30000);
        dao.addEmp(newEmp);
    }
}