// UC8: define company specifc parameters for different companies
public class Company {
    String name;
    int wage_per_hour;
    int full_time_hours;
    int part_time_hours;
    int working_days;
    int max_working_hours;
    int total_wage; // UC9: save total wage for the company

    public Company(String name, int wage_per_hour, int full_time_hours, int part_time_hours, int working_days,
            int max_working_hours) {
        this.name = name;
        this.wage_per_hour = wage_per_hour;
        this.full_time_hours = full_time_hours;
        this.part_time_hours = part_time_hours;
        this.working_days = working_days;
        this.max_working_hours = max_working_hours;
    }

    public void updateTotalWage(int employee_wage) {
        this.total_wage += employee_wage;
    }
}