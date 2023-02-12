public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(7.50, 35);
        Employee employee2 = new Employee(8.20, 47);
        Employee employee3 = new Employee(10.00, 73);

        System.out.println("Employee 1 salary: " + employee1.calculateSalary());
        System.out.println("Employee 2 salary: " + employee2.calculateSalary());
        System.out.println("Employee 3 salary: " + employee3.calculateSalary());
    }
}
