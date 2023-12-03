import java.util.HashMap;

// UC10: created an Employee Wage Builder to have multiple companies details
// UC11: using Interface ot create employee wage builder
public class EmpWageBuilder implements BuilderInterface {

    private HashMap<String, Company> companies;

    public EmpWageBuilder() {
        this.companies = new HashMap<String, Company>();
    }

    public void addCompany(String name, int wage_per_hour, int full_time_hours, int part_time_hours, int working_days,
            int max_working_hours) {
        companies.put(name,
                new Company(name, wage_per_hour, full_time_hours, part_time_hours, working_days, max_working_hours));
    }

    public int getTotalCompanyWage(String name) {
        if (this.companies.containsKey(name)) {
            Company company = this.companies.get(name);
            int total_wage = 0;
            for (Employee employee : company.employees) {
                total_wage += employee.getMonthlyWage();
            }
            return total_wage;
        } else {
            System.out.println("No such company found.\n");
        }
        return -1;
    }

    public Company getCompanybyName(String name) {
        return this.companies.containsKey(name) ? this.companies.get(name) : null;
    }
}