// UC10: created an Employee Wage Builder to have multiple companies details
public class EmpWageBuilder {

    Company[] companies;
    int number_of_companies;

    public EmpWageBuilder() {
        this.number_of_companies = 0;
        this.companies = new Company[100];
    }

    public void addCompany(String name, int wage_per_hour, int full_time_hours, int part_time_hours, int working_days,
            int max_working_hours) {
        this.companies[this.number_of_companies] = new Company(name, wage_per_hour, full_time_hours, part_time_hours,
                working_days, max_working_hours);
        this.number_of_companies++;
    }

    public int getTotalCompanyWage(Company company) {
        int total_wage = 0;
        for (Employee employee : company.employees) {
            total_wage += employee.getMonthlyWage();
        }
        return total_wage;
    }
}