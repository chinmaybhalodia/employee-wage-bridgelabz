public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Employee Wage Computation Program");

        // UC10: creating an employee wage builder
        EmpWageBuilder empWageBuilder = new EmpWageBuilder();

        // adding the companies to wage builder
        empWageBuilder.addCompany("Company1", 20, 8, 4, 20, 100);
        empWageBuilder.addCompany("Company2", 30, 8, 4, 25, 120);

        // UC8: creating employees of these companies
        Employee e1 = new Employee("Emp1", "FULL", empWageBuilder.companies[0]);
        System.out.println("Daily wage for " + e1.name + " : " + e1.getDailyWage());
        System.out.println("Monthly wage for " + e1.name + " : " + e1.getMonthlyWage());
        System.out.println("Total wage for " + e1.name + " : " + e1.calculateTotalWage());

        Employee e2 = new Employee("Emp2", "FULL", empWageBuilder.companies[1]);
        System.out.println("Daily wage for " + e2.name + " : " + e2.getDailyWage());
        System.out.println("Monthly wage for " + e2.name + " : " + e2.getMonthlyWage());
        System.out.println("Total wage for " + e2.name + " : " + e2.calculateTotalWage());

        Employee e3 = new Employee("Emp3", "PART", empWageBuilder.companies[0]);
        System.out.println("Daily wage for " + e3.name + " : " + e3.getDailyWage());
        System.out.println("Monthly wage for " + e3.name + " : " + e3.getMonthlyWage());
        System.out.println("Total wage for " + e3.name + " : " + e3.calculateTotalWage());

        Employee e4 = new Employee("Emp4", "PART", empWageBuilder.companies[1]);
        System.out.println("Daily wage for " + e4.name + " : " + e4.getDailyWage());
        System.out.println("Monthly wage for " + e4.name + " : " + e4.getMonthlyWage());
        System.out.println("Total wage for " + e4.name + " : " + e4.calculateTotalWage());

        // UC9: Getting total wage for both companies
        System.out.println("Total wage for this company c1 is: "
                + empWageBuilder.getTotalCompanyWage(empWageBuilder.companies[0]));
        System.out.println("Total wage for this company c1 is: "
                + empWageBuilder.getTotalCompanyWage(empWageBuilder.companies[1]));
    }
}
