public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Employee Wage Computation Program");

        // employee e1
        Employee e1 = new Employee("FULL");

        // checking attendance of employee e1
        System.out.println(e1.checkAttendance());

        // getting daily full time wage
        e1.getFullTimeWage();

        // employee e2
        Employee e2 = new Employee("PART");

        // getting daily part time wage
        e2.getPartTimeWage();

        // getting daily wage by switch statement
        e1.getDailyWage();
        e2.getDailyWage();

        // getting monthly wages for employees
        e1.getMonthlyWage();
        e2.getMonthlyWage();
    }
}
