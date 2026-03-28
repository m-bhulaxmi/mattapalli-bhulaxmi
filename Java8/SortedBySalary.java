
package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given an Employee list sort employees based on their salaries in desc order
 */
public class SortedBySalary {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "IT",7000),
                new Employee("Bob", "IT",8500),
                new Employee("Charlie", "HR",6000),
                new Employee("David", "IT",9500),
                new Employee("laxmi", "FINANCE",5000)
        );

        // Optional: Print to verify
        //employees.forEach(System.out::println);
        List<Employee> empSalaries= employees.stream()
                .sorted(Comparator.comparing(Employee::getSalaries).reversed())
                /**
                 * fetch top3 salaries
                 */
                //.limit(3)
                /**
                 * fetch all employees having salary less than 3rd highest salary
                 */
                .skip(3)
                .collect((Collectors.toList()));
                empSalaries.forEach(System.out::println);
        // to get output in list of output
        //System.out.println(empSalaries);
        System.out.println("Highest-Paid Salry in IT Department");
        List<Employee> top3Salary = employees.stream()
                .filter(e->"IT".equals(e.getDepartmentName()))
                .sorted(Comparator.comparingDouble(Employee::getSalaries).reversed())
                .limit(3)
                .collect(Collectors.toList());
        top3Salary.forEach(System.out::println);

    }
}
