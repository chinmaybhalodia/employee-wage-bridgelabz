public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Employee Wage Computation Program");

        // UC8: creating two different companies
        Company c1 = new Company(20, 8, 4, 20, 100);
        Company c2 = new Company(30, 8, 4, 25, 120);

        // UC8: creating employees of these companies
        Employee e1 = new Employee("FULL", c1);
        e1.getDailyWage();
        e1.getMonthlyWage();
        e1.calculateTotalWage();

        Employee e2 = new Employee("FULL", c2);
        e2.getDailyWage();
        e2.getMonthlyWage();
        e2.calculateTotalWage();

        Employee e3 = new Employee("PART", c1);
        e3.getDailyWage();
        e3.getMonthlyWage();
        e3.calculateTotalWage();

        Employee e4 = new Employee("PART", c2);
        e4.getDailyWage();
        e4.getMonthlyWage();
        e4.calculateTotalWage();
    }
}
