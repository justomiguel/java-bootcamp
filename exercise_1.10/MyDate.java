/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydateproject;

/**
 *
 * @author roberta
 */
public class MyDate {

    private int year;
    private int month;
    private int day;

    public static final int MIN_YEAR = 1;
    public static final int MAX_YEAR = 9999;
    public static final int MIN_MONTH = 1;
    public static final int MAX_MONTH = 12;
    public static final int MIN_DAY = 1;
    public static final int MAX_DAY = 31;

    private static String[] strMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    private static String[] strDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    private static int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public MyDate(int year, int month, int day) throws IllegalArgumentException {
        if (!(isValidDate(year, month, day))) {
            throw new IllegalArgumentException("Invalid date");
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    public static boolean isValidDate(int year, int month, int day) {

        if (!(year >= MIN_YEAR && year <= MAX_YEAR)) {
            return false;
        }

        if (!(month >= MIN_MONTH && month <= MAX_MONTH)) {
            return false;
        }

        if (!(day >= MIN_DAY && day <= MAX_DAY)) {
            return false;
        }
        if (day > daysInMonth[month - 1]) {
            return false;
        }
        if (isLeapYear(year) && (month == 2 && (day > 29))) {
            return false;
        }

        return true;
    }

    public static int yearCentury(int year) {

        int yearC = year / 100;

        switch (yearC) {
            case 17:
                return 4;
            case 18:
                return 2;
            case 19:
                return 0;
            case 20:
                return 6;
            case 21:
                return 4;
            case 22:
                return 2;
            case 23:
                return 0;
            default:
                return 6;
        }

    }

    public static int getMonthTable(int month, boolean leapYear) {
        switch (month) {
            case 1:
                if (leapYear) {
                    return 6;
                }
                return 0;
            case 2:
                if (leapYear) {
                    return 2;
                }
                return 3;
            case 3:
                return 3;
            case 4:
                return 6;
            case 5:
                return 1;
            case 6:
                return 4;
            case 7:
                return 6;
            case 8:
                return 2;

            case 9:
                return 5;
            case 10:
                return 0;
            case 11:
                return 3;
            default:
                return 5;
        }

    }

    //For example: 2012, Feb, 17   =  (6 + 12 + 12/4 + 2 + 17) % 7 = 5 (Fri)
    public static int getDayOfWeek(int year, int month, int day) {
        int lastTwo = year % 1000;
        int yearCentury = yearCentury(year);

        boolean leapYear1 = isLeapYear(year);
        int monthTable = getMonthTable(month, leapYear1);

        int resul = (yearCentury + lastTwo + ((lastTwo / 4) + monthTable + day)) % 7;
        return resul;
    }

    //setDate(int year, int month, int day): It shall invoke the static method isValidDate()
    public void setDate(int year, int month, int day) throws IllegalArgumentException {
        if (!isValidDate(year, month, day)) {

            throw new IllegalArgumentException("Invalid year, month, or day!");
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setYear(int year) throws IllegalArgumentException {
        if (!(year < 1 || year > 9999)) {
            throw new IllegalArgumentException("Invalid year!");
        }
        this.year = year;
    }

    public void setMonth(int month) throws IllegalArgumentException {
        if (!(month < 1 || month > 12)) {
            throw new IllegalArgumentException("Invalid month!");
        }
        this.month = month;
    }

    //setDay(int day): It shall verify that the given day is between 1 and dayMax, where dayMax depends
    //on the month and whether it is a leap year for Feb.
    public void setDay(int day) throws IllegalArgumentException {
        int extraDay = 0;
        if (isLeapYear(year) && month == 2) {
            extraDay = 1;
        }
        if ((day > daysInMonth[month + 1] + extraDay)) {
            throw new IllegalArgumentException("Invalid day");
        }
        this.day = day;

    }

    //toString(): returns a date string in the format "xxxday d mmm yyyy", e.g., "Tuesday 14 Feb 2012".
    @Override
    public String toString() {
        int dayOfWeek = getDayOfWeek(year, month, day);
        return strDays[dayOfWeek] + " " + day + " " + strMonths[month - 1] + " " + year;
    }

//nextDay(): update this instance to the next day and return this instance. 
    //Take note that nextDay() for 31 Dec 2000 shall be 1 Jan 2001.
    public MyDate nextDay() throws IllegalArgumentException {
        day++;
        int extraDay = 0;
        if (isLeapYear(year) && month == 2) {
            extraDay = 1;
        }

        if ((day > daysInMonth[month - 1] + extraDay)) {
            day = MIN_DAY;
            nextMonth();
        }
        return this;
    }

    public MyDate nextMonth() {
        month++;
        if (month > MAX_MONTH) {
            month = MIN_MONTH;
            nextYear();
        }
        return this;
    }

    public MyDate nextYear() throws IllegalArgumentException {
        if (isLeapYear(year) && month == 2 && day == 29) {
            day = 28;
        }
        year++;
        if (year > MAX_YEAR) {
            throw new IllegalArgumentException("Year out of range");
        }
        return this;
    }

    //previousDay(), previousMonth(), previousYear(): similar to the above.
    public MyDate previousDay() throws IllegalArgumentException {
        day--;

        if ((day < MIN_DAY)) {
            previousMonth();
            day = daysInMonth[month - 1];
        }
        return this;
    }

    public MyDate previousMonth() {
        int monthBefore = month;
        month--;
        if (month < MIN_MONTH) {
            month = MAX_MONTH;
            previousYear();
        }
        if (day == daysInMonth[monthBefore - 1]) {
            day = daysInMonth[month - 1];
        }

        return this;
    }

    public MyDate previousYear() throws IllegalArgumentException {
        if (isLeapYear(year) && month == 2 && day == 29) {
            day = 28;
        }
        year--;
        if (year > MAX_YEAR) {
            throw new IllegalArgumentException("Year out of range");
        }
        return this;
    }
}
