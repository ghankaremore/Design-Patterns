public class EmployeeFactory {
    public static Employee getEmployee(AbstractEmployeeFactory abstractEmployeeFactory){
        return abstractEmployeeFactory.getEmployee();

    }
}
