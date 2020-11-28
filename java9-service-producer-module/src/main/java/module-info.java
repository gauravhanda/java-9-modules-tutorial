import org.letsdoguru.services.EmployeeServiceImpl;
import org.letsdoguru.services.EmployeeServiceImplV2;

module java9.service.producer.module {
    exports org.letsdoguru.model;
    exports org.letsdoguru.services;
    requires  java.base;
    provides org.letsdoguru.services.EmployeeService with EmployeeServiceImpl, EmployeeServiceImplV2;   
}