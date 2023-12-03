public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Employee Wage Computation Program");

        // UC8: creating two different companies
        Company c1 = new Company("Company1", 20, 8, 4, 20, 100);
        Company c2 = new Company("Company2", 30, 8, 4, 25, 120);

        // UC8: creating employees of these companies
        Employee e1 = new Employee("Emp1", "FULL", c1);
        System.out.println("Daily wage for " + e1.name + " : " + e1.getDailyWage());
        System.out.println("Monthly wage for " + e1.name + " : " + e1.getMonthlyWage());
        System.out.println("Total wage for " + e1.name + " : " + e1.calculateTotalWage());

        Employee e2 = new Employee("Emp2", "FULL", c2);
        System.out.println("Daily wage for " + e2.name + " : " + e2.getDailyWage());
        System.out.println("Monthly wage for " + e2.name + " : " + e2.getMonthlyWage());
        System.out.println("Total wage for " + e2.name + " : " + e2.calculateTotalWage());

        Employee e3 = new Employee("Emp3", "PART", c1);
        System.out.println("Daily wage for " + e3.name + " : " + e3.getDailyWage());
        System.out.println("Monthly wage for " + e3.name + " : " + e3.getMonthlyWage());
        System.out.println("Total wage for " + e3.name + " : " + e3.calculateTotalWage());

        Employee e4 = new Employee("Emp4", "PART", c2);
        System.out.println("Daily wage for " + e4.name + " : " + e4.getDailyWage());
        System.out.println("Monthly wage for " + e4.name + " : " + e4.getMonthlyWage());
        System.out.println("Total wage for " + e4.name + " : " + e4.calculateTotalWage());

        // UC9: Getting total wage for both companies
        System.out.println("Total wage for this company c1 is: " + c1.total_wage);
        System.out.println("Total wage for this company c2 is: " + c2.total_wage);
    }
}
