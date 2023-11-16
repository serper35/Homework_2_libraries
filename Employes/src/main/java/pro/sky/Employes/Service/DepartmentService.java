package pro.sky.Employes.Service;

import java.util.List;
import java.util.Map;

public interface DepartmentService {

    Employees minSalary(int dep);
    Employees maxSalary(int dep);

    Map<Integer,List<Employees>> allEmployees();
    List<Employees> employeesByDep(int dep);
}
