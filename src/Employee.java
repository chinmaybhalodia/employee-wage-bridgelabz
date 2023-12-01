public class Employee {
    static int wage_per_hour = 20;
    static int full_time_hours = 8;
    static int part_time_hours = 4;
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
}
