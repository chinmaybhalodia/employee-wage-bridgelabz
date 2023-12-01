public class Employee {
    String type; // FULL for full time employee and PART for part time employee

    // UC8: added specific company for every employee.
    // work params differ based on company.
    Company company;

    public Employee(String type, Company company) {
        this.type = type;
        this.company = company;
    }

    // UC1 : function to check employee attendance
    public boolean checkAttendance() {
        double val = Math.random();
        if (val > 0.5)
            return true;
        return false;
    }

    // UC4: function to get employee wage by switch statement
    public void getDailyWage() {
        switch (type) {
            case "FULL":
                System.out.println("Daily wage for this full time employee is: "
                        + company.full_time_hours * company.wage_per_hour);
                break;

            case "PART":
                System.out.println(
                        "Daily wage for this part time employee is: "
                                + company.part_time_hours * company.wage_per_hour);
                break;
        }
    }

    // UC5: calculate monthly wages
    public void getMonthlyWage() {
        int work_hours;
        if (this.type.equals("FULL"))
            work_hours = company.working_days * company.full_time_hours;
        else
            work_hours = company.working_days * company.part_time_hours;

        int monthlyWage = work_hours * company.wage_per_hour;
        System.out.println("Monthly wage for this employee is: " + monthlyWage);
    }

    // UC6: get total wage as per condition
    public void calculateTotalWage() {
        int work_hours = 0;
        int days = 0;

        for (int i = 0; i < 30; i++) {
            if (this.checkAttendance()) {
                if (this.type.equals("FULL"))
                    work_hours += company.full_time_hours;
                else
                    work_hours += company.part_time_hours;

                days++;
            }

            if (work_hours >= company.max_working_hours || days == company.working_days)
                break;
        }

        int total_wage = work_hours * company.wage_per_hour;
        System.out.println("Total wage for this employee is: " + total_wage);
    }
}
