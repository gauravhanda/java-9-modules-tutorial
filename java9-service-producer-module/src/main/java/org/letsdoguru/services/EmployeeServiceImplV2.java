package org.letsdoguru.services;

import org.letsdoguru.model.Employee;
import org.letsdoguru.services.EmployeeService;

import java.util.List;

public class EmployeeServiceImplV2 implements EmployeeService {
    @Override
    public Employee create(Employee employee) {
        return null;
    }

    @Override
    public boolean delete(Employee employee) {
        return false;
    }

    @Override
    public boolean update(Employee employee) {
        return false;
    }

    @Override
    public List<Employee> findByID(int id) {
        return null;
    }

    @Override
    public List<Employee> findByZIP(int zipCode) {
        return null;
    }

    @Override
    public String getVersion() {
        return "V2";
    }
}
