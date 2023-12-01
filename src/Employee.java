public class Employee {
    static int wage_per_hour = 20;
    static int full_time_hours = 8;
    static int part_time_hours = 4;
    static int working_days = 20;
    String type; // FULL for full time employee and PART for part time employee

    public Employee(String type) {
        this.type = type;
    }

    // UC1 : function to check employee attendance
    public boolean checkAttendance() {
        double val = Math.random();
        if (val > 0.5)
            return true;
        return false;
    }

    // UC2: function to get full time employee wage
    public void getFullTimeWage() {
        if (!this.type.equals("FULL")) {
            System.out.println("The employee is not full time employee.");
        } else {
            int dailywage = full_time_hours * wage_per_hour;
            System.out.println("Daily wage for this full time employee is: " + dailywage);
        }
    }

    // UC3: function to get part time employee wage
    public void getPartTimeWage() {
        if (!this.type.equals("PART")) {
            System.out.println("The employee is not part time employee.");
        } else {
            int dailywage = part_time_hours * wage_per_hour;
            System.out.println("Daily wage for this part time employee is: " + dailywage);
        }
    }

    // UC4: function to get employee wage by switch statement
    public void getDailyWage() {
        switch (type) {
            case "FULL":
                System.out.println("Daily wage for this full time employee is: " + full_time_hours * wage_per_hour);
                break;

            case "PART":
                System.out.println("Daily wage for this part time employee is: " + part_time_hours * wage_per_hour);
                break;
        }
    }

    // UC5: calculate monthly wages
    public void getMonthlyWage() {
        int work_hours;
        if (this.type.equals("FULL"))
            work_hours = working_days * full_time_hours;
        else
            work_hours = working_days * part_time_hours;

        int monthlyWage = work_hours * wage_per_hour;
        System.out.println("Monthly wage for this employee is: " + monthlyWage);
    }

    // UC6: get total wage as per condition
    public void calculateTotalWage() {
        int work_hours = 0;
        int days = 0;

        for (int i = 0; i < 30; i++) {
            if (this.checkAttendance()) {
                if (this.type.equals("FULL"))
                    work_hours += full_time_hours;
                else
                    work_hours += part_time_hours;

                days++;
            }

            if (work_hours >= 100 || days == 20)
                break;
        }

        int total_wage = work_hours * wage_per_hour;
        System.out.println("Total wage for this employee is: " + total_wage);
    }
}
