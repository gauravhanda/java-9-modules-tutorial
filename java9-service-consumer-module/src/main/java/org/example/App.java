package org.example;


import org.letsdoguru.services.EmployeeService;
import org.letsdoguru.services.EmployeeServiceImpl;

import java.util.ServiceLoader;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        try {
            ServiceLoader<EmployeeService> employeeService = ServiceLoader.load(EmployeeService.class);
            employeeService.stream().map(instance -> instance.get().getVersion()).forEach(System.out::println);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
