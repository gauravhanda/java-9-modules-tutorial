package org.letsdoguru.services;

import org.letsdoguru.model.Employee;

import java.io.Serializable;
import java.util.List;

public interface EmployeeService extends Serializable {
    Employee create(Employee employee);
    boolean delete(Employee employee);
    boolean update(Employee employee);
    List<Employee> findByID(int id);
    List<Employee> findByZIP(int zipCode);
    String getVersion();
}
