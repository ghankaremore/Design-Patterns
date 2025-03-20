
public class Main {
    public static void main(String[] args) {
     Employee employee = EmployeeFactory.getEmployee(new WebDeveloperFactory());
        System.out.println("The name is " + employee.name());
        System.out.println("The salary is " + employee.salary());

        Employee employee1 = EmployeeFactory.getEmployee(new AndroidDeveloperFactory());
        System.out.println("The name is " + employee1.name());
        System.out.println("The salary is " + employee1.salary());
    }
}