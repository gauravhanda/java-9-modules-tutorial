import org.letsdoguru.services.EmployeeService;

module service.consumer {
    requires java9.service.producer.module;
    uses EmployeeService;
}