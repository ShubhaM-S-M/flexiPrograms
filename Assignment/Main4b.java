abstract class Employee
{
    int empId;
    String name;
    double baseSalary;

    Employee(int empId, String name, double baseSalary)
    {
        this.empId = empId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    void displayEmployeeInfo()
    {
        System.out.println("Employee Id = " + empId);
        System.out.println("Name = " + name);
        System.out.println("Base Salary = " + baseSalary);
    }

    abstract double calculateSalary();
}

class FullTimeEmployee extends Employee
{
    double bonus;

    FullTimeEmployee(int empId, String name, double baseSalary, double bonus)
    {
        super(empId, name, baseSalary);
        this.bonus = bonus;
    }

    double calculateSalary()
    {
        return baseSalary + bonus;
    }
}

class PartTimeEmployee extends Employee
{
    int hoursWorked;
    double ratePerHour;

    PartTimeEmployee(int empId, String name, int hoursWorked, double ratePerHour)
    {
        super(empId, name, 0);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    double calculateSalary()
    {
        return hoursWorked * ratePerHour;
    }
}

class ContractEmployee extends Employee
{
    double contractAmount;

    ContractEmployee(int empId, String name, double contractAmount)
    {
        super(empId, name, 0);
        this.contractAmount = contractAmount;
    }

    double calculateSalary()
    {
        return contractAmount;
    }
}

class Main4b
{
    public static void main(String args[])
    {
        FullTimeEmployee f = new FullTimeEmployee(1, "Rahul", 50000, 10000);
        f.displayEmployeeInfo();
        System.out.println("Total Salary = " + f.calculateSalary());

        System.out.println();

        PartTimeEmployee p = new PartTimeEmployee(2, "Amit", 40, 500);
        p.displayEmployeeInfo();
        System.out.println("Total Salary = " + p.calculateSalary());

        System.out.println();

        ContractEmployee c = new ContractEmployee(3, "Sneha", 60000);
        c.displayEmployeeInfo();
        System.out.println("Total Salary = " + c.calculateSalary());
    }
}