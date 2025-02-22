package MyDate;

public class MyDate {
    private int year;
    private int month;
    private int day;
    
    private static final String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    private static final String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    private static final int[] DAYS_IN_MONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    public MyDate(int year, int month, int day) {
        setDate(year, month, day);
    }
    
    public void setDate(int year, int month, int day) {
        if (isValidDate(year, month, day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        } else {
            throw new IllegalArgumentException("Invalid year, month, or day!");
        }
    }
    
    public int getYear() { return year; }
    public int getMonth() { return month; }
    public int getDay() { return day; }
    
    public void setYear(int year) { 
        if (year < 1 || year > 9999) throw new IllegalArgumentException("Invalid year!");
        this.year = year; 
    }
    
    public void setMonth(int month) { 
        if (month < 1 || month > 12) throw new IllegalArgumentException("Invalid month!");
        this.month = month; 
    }
    
    public void setDay(int day) { 
        if (day < 1 || day > daysInMonth(year, month)) throw new IllegalArgumentException("Invalid day!");
        this.day = day; 
    }
    
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    
    public static boolean isValidDate(int year, int month, int day) {
        return year >= 1 && year <= 9999 && month >= 1 && month <= 12 && day >= 1 && day <= daysInMonth(year, month);
    }

    private static int daysInMonth(int year, int month) {
        if (month == 2 && isLeapYear(year)) return 29;
        return DAYS_IN_MONTHS[month - 1];
    }
    
    public String toString() {
        return DAYS[getDayOfWeek(year, month, day)] + " " + day + " " + MONTHS[month - 1] + " " + year;
    }
    
    public static int getDayOfWeek(int year, int month, int day) {
        int m = (month < 3) ? month + 12 : month;
        int y = (month < 3) ? year - 1 : year;
        int K = y % 100;
        int J = y / 100;
        int dayOfWeek = (day + (13 * (m + 1)) / 5 + K + (K / 4) + (J / 4) + (5 * J)) % 7;
        return (dayOfWeek + 5) % 7;  // Điều chỉnh lại chỉ mục ngày
    }
    
    public MyDate nextDay() {
        if (isValidDate(year, month, day + 1)) {
            day++;
        } else if (month < 12) {
            day = 1;
            month++;
        } else {
            day = 1;
            month = 1;
            if (year < 9999) year++;
            else throw new IllegalStateException("Year out of range!");
        }
        return this;
    }

    public MyDate previousDay() {
        if (day > 1) {
            day--;
        } else if (month > 1) {
            month--;
            day = daysInMonth(year, month);
        } else {
            month = 12;
            day = 31;
            if (year > 1) year--;
            else throw new IllegalStateException("Year out of range!");
        }
        return this;
    }

    public MyDate nextMonth() {
        if (month < 12) {
            month++;
        } else {
            month = 1;
            if (year < 9999) year++;
            else throw new IllegalStateException("Year out of range!");
        }
        if (day > daysInMonth(year, month)) {
            day = daysInMonth(year, month);
        }
        return this;
    }

    public MyDate nextYear() {
        if (year < 9999) {
            year++;
            if (day > daysInMonth(year, month)) {
                day = daysInMonth(year, month);
            }
        } else {
            throw new IllegalStateException("Year out of range!");
        }
        return this;
    }

    public MyDate previousMonth() {
        if (month > 1) {
            month--;
        } else {
            month = 12;
            if (year > 1) year--;
            else throw new IllegalStateException("Year out of range!");
        }
        if (day > daysInMonth(year, month)) {
            day = daysInMonth(year, month);
        }
        return this;
    }

    public MyDate previousYear() {
        if (year > 1) {
            year--;
            if (day > daysInMonth(year, month)) {
                day = daysInMonth(year, month);
            }
        } else {
            throw new IllegalStateException("Year out of range!");
        }
        return this;
    }

    public static void main(String[] args) {
        MyDate d1 = new MyDate(2012, 2, 28);
        System.out.println(d1);
        System.out.println(d1.nextDay());
        System.out.println(d1.nextDay());
        System.out.println(d1.nextMonth());
        System.out.println(d1.nextYear());

        MyDate d2 = new MyDate(2012, 1, 2);
        System.out.println(d2);
        System.out.println(d2.previousDay());
        System.out.println(d2.previousDay());
        System.out.println(d2.previousMonth());
        System.out.println(d2.previousYear());

        MyDate d3 = new MyDate(2012, 2, 29);
        System.out.println(d3.previousYear());

        MyDate d4 = new MyDate(2011, 12, 28);
        for (int i = 0; i < 65; i++) {
            System.out.println(d4.nextDay());
        }
    }
}
