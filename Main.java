public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "RUWAIS";
        employee.age = 19;
        employee.phoneNumber = "9791061809";
        employee.address = "NO 12 ANNA NAGAR,NEWRY PARKTOWERS";
        employee.salary = 56000.00;
        employee.specialization = "WEB PAGE DEVELOPER";

        Manager manager = new Manager();
        manager.name = "SIMRA MAHEEN";
        manager.age = 20;
        manager.phoneNumber = "9043098323";
        manager.address = "NO 26 SECRETARIAT COLONY";
        manager.salary = 200000.00;
        manager.department = "APPLICAION DEVELOPER";

        System.out.println("Employee:");
        System.out.println("Name: " + employee.name);
        System.out.println("Age: " + employee.age);
        System.out.println("Phone Number: " + employee.phoneNumber);
        System.out.println("Address: " + employee.address);
        System.out.println("Salary: " + employee.salary);
        System.out.println("Specialization: " + employee.specialization);

        System.out.println("\nManager:");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone Number: " + manager.phoneNumber);
        System.out.println("Address: " + manager.address);
        System.out.println("Salary: " + manager.salary);
        System.out.println("Department: " + manager.department);
    }
}