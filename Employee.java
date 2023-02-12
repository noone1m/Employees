class Employee {
    private double basePay;
    private int hoursWorked;

    public Employee(double basePay, int hoursWorked) {
        this.basePay = basePay;
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary() {
        if (hoursWorked <= 40) {
            return basePay * hoursWorked;
        } else if (hoursWorked <= 60) {
            int overtime = hoursWorked - 40;
            double overtimePay = overtime * (basePay * 1.5);
            return (40 * basePay) + overtimePay;
        } else {
            return -1; // Not allowed to work more than 60 hours.
        }
    }
}
