package Lab10;


import lab8.Employee;

import java.util.List;

public interface empDAO {
    public List<Employee> getALLEmp();
    public void  addEmp (Employee emp);
    public Employee getEmpById (int id);
    public void  updateEmp(Employee emp);
    public void  deleteEmp(int id);

}