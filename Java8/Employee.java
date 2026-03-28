package Java8;


public class Employee {
    private String name;
    private String departmentName;
    private double salaries;

    public Employee(String name, String departmentName, double salaries) {
        this.name = name;
        this.departmentName=departmentName;
        this.salaries = salaries;
    }

    public String getName() {
        return name;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public double getSalaries() {
        return salaries;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", salaries=" + salaries +
                '}';
    }
}

