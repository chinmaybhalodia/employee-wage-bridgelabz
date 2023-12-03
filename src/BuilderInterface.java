// UC11: Interface method

public interface BuilderInterface {
    public void addCompany(String name, int wage_per_hour, int full_time_hours, int part_time_hours, int working_days,
            int max_working_hours);

    public int getTotalCompanyWage(String company_name);

    // UC13: adding daily wage for companies
    public int getDailyCompanyWage(String company_name);
}