/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytimeproject;

/**
 *
 * @author roberta
 */
public class MyTime {

    private int hour = 0;
    private int minute = 0;
    private int second = 0;
    
    public static final int MAX_SECOND = 59;
    public static final int MAX_MINUTE = 59;
    public static final int MAX_HOUR = 23;
    
    public static final int MIN_SECOND = 0;
    public static final int MIN_MINUTE = 0;
    public static final int MIN_HOUR = 0;
    

    public MyTime(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public void setHour(int hour) throws IllegalArgumentException {
        if (hour < MIN_HOUR || hour > MAX_HOUR) {
            throw new IllegalArgumentException("Invalid Hour");
        }
        this.hour = hour;
    }

    public void setMinute(int minute) throws IllegalArgumentException {
        if (minute < MIN_MINUTE || minute > MAX_MINUTE) {
            throw new IllegalArgumentException("Invalid Minute");
        }
        this.minute = minute;
    }

    public void setSecond(int second) throws IllegalArgumentException {
        if (second < MIN_SECOND || second > MAX_SECOND) {
            throw new IllegalArgumentException("Invalid Second");
        }
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    //toString(): returns "HH:MM:SS".
    @Override
    public String toString() {
        return hour + ":" + minute + ":" + second;
    }

    public MyTime nextSecond() {
        second++;
        if (second > MAX_SECOND) {
            second = MIN_SECOND;
            nextMinute();
        }
        return this;
    }

    public MyTime nextMinute() {
        minute++;
        if (minute > MAX_MINUTE) {
            minute = MIN_MINUTE;
            nextHour();
        }
        return this;
    }

    public MyTime nextHour() {
        hour++;
        if (hour > MAX_HOUR) {
            hour = MIN_HOUR;
        }
        return this;
    }

    public MyTime previousHour() {
        hour--;
        if (hour < MIN_HOUR) {
            hour = MAX_HOUR;
        }
        return this;
    }

    public MyTime previousMinute() {
        minute--;
        if (minute < MIN_MINUTE) {
            minute = MAX_MINUTE;
            previousHour();
        }
        return this;
    }

    public MyTime previousSecond() {
        second--;
        if (second < MIN_SECOND) {
            second = MAX_SECOND;
            previousMinute();
        }
        return this;
    }

}
