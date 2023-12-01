public class Employee {
    static int wage_per_hour = 20;
    static int full_time_hours = 8;
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
}
