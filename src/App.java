public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Employee Wage Computation Program");

        // employee e1
        Employee e1 = new Employee("FULL");

        // checking attendance of employee e1
        System.out.println(e1.checkAttendance());

        // getting daily full time wage
        e1.getFullTimeWage();
    }
}
