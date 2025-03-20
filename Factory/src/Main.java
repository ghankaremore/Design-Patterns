import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee position name below");
         String developer = sc.nextLine();
         employee employee = factory.getemployee(developer);
         int salary =employee.salary();
        System.out.println("Salary is " + salary);

    }
}