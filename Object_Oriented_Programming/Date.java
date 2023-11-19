import java.util.Scanner;

public class Date {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int year = getValidYear(in);

        if (year == -1) {
            System.out.println("Invalid input for year");
            return;
        }

        int month = getValidMonth(in);

        if (month == -1) {
            System.out.println("Invalid input for month");
            return;
        }

        int day = getValidDay(in, month, year);

        if (day == -1) {
            System.out.println("Invalid input for day");
            return;
        }

        // Check if the year is a leap year
        boolean isLeapYear = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));

        // Determine the number of days in the month
        int daysInMonth = getDaysInMonth(month, isLeapYear);
        System.out.println(getMonthName(month) + " " + day + ", " + year);
        System.out.println(daysInMonth + " days");
        
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is a common year.");
        }
    }

    public static int getValidYear(Scanner in) {
        int year = 0;
        try {
            year = Integer.parseInt(in.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
        return year;
    }

    public static int getValidMonth(Scanner in) {
        int month = 0;
        try {
            month = Integer.parseInt(in.nextLine());

            // Check if the entered month is within a valid range (1 to 12)
            if (month < 1 || month > 12) {
                return -1;
            }
        } catch (NumberFormatException e) {
            return -1;
        }
        return month;
    }

    public static int getValidDay(Scanner in, int month, int year) {
        int day = 0;
        try {
            day = Integer.parseInt(in.nextLine());

            // Check if the entered day is within a valid range
            int maxDays = getDaysInMonth(month, ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)));
            if (day < 1 || day > maxDays) {
                return -1;
            }

        } catch (NumberFormatException e) {
            return -1;
        }
        return day;
    }

    public static String getMonthName(int month) {
        switch (month) {
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            default: return "Invalid Month";
        }
    }

    public static int getDaysInMonth(int month, boolean isLeapYear) {
        switch (month) {
            case 4:  // April
            case 6:  // June
            case 9:  // September
            case 11: // November
                return 30;
            case 2:  // February
                return isLeapYear ? 29 : 28;
            default:
                return 31;
        }
    }
}
