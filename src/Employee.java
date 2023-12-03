public class Employee {
    String name;
    String type; // FULL for full time employee and PART for part time employee

    // UC8: added specific company for every employee.
    // work params differ based on company.
    Company company;

    public Employee(String name, String type, Company company) {
        this.name = name;
        this.type = type;
        this.company = company;
        company.employees.add(this);
    }

    // UC1 : function to check employee attendance
    public boolean checkAttendance() {
        double val = Math.random();
        if (val > 0.5)
            return true;
        return false;
    }

    // UC4: function to get employee wage by switch statement
    public int getDailyWage() {
        switch (type) {
            case "FULL":
                int daily_full_wage = company.full_time_hours * company.wage_per_hour;
                return daily_full_wage;

            case "PART":
                int daily_part_wage = company.part_time_hours * company.wage_per_hour;
                return daily_part_wage;
        }
        return -1;
    }

    // UC5: calculate monthly wages
    public int getMonthlyWage() {
        int work_hours;
        if (this.type.equals("FULL"))
            work_hours = company.working_days * company.full_time_hours;
        else
            work_hours = company.working_days * company.part_time_hours;

        int monthlyWage = work_hours * company.wage_per_hour;
        return monthlyWage;
    }

    // UC6: get total wage as per condition
    public int calculateTotalWage() {
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
        return total_wage;
    }
}
