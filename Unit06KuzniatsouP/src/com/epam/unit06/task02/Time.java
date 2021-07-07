package com.epam.unit06.task02;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time() {
        hours = 0;
        minutes = 0;
        seconds = 0;
    }

    public Time(int _hours, int _minutes, int _seconds) {
        if (_hours > 24 || _hours < 0) {
            hours = 0;
        }
        if (_minutes > 59 || _minutes < 0) {
            minutes = 0;
        }
        if (_seconds > 59 || _seconds < 0) {
            seconds = 0;
        } else {
            hours = _hours;
            minutes = _minutes;
            seconds = _seconds;
        }

    }

    public int increaseHours(int _plus) {
        hours = hours + _plus;
        if (hours >= 24 || hours < 0) {
            hours = 0;
        }
        return hours;
    }

    public int decreaseHours(int _minus) {
        hours = hours - _minus;
        if (hours >= 24 || hours < 0) {
            hours = 0;
        }
        return hours;
    }

    public int increaseMinutes(int _plus) {
        minutes = minutes + _plus;
        if (minutes > 59 || minutes < 0) {
            minutes = 0;
        }
        return minutes;
    }

    public int decreaseMinutes(int _minus) {
        minutes = minutes - _minus;
        if (minutes > 59 || minutes < 0) {
            minutes = 0;
        }
        return minutes;
    }

    public int increaseSeconds(int _plus) {
        seconds = seconds + _plus;
        if (seconds > 59 || seconds < 0) {
            seconds = 0;
        }
        return seconds;
    }

    public int decreaseSeconds(int _minus) {
        seconds = seconds - _minus;
        if (seconds > 59 || seconds < 0) {
            seconds = 0;
        }
        return seconds;
    }

    public int setHours(int _hours) {
        if (_hours >= 24 || _hours < 0) {
            hours = 0;
        } else {
            hours = _hours;
        }
        return hours;
    }

    public int setMinutes(int _minutes) {
        if (_minutes > 59 || _minutes < 0) {
            minutes = 0;
        } else {
            minutes = _minutes;
        }
        return minutes;
    }

    public int setSeconds(int _seconds) {
        if (_seconds > 59 || _seconds < 0) {
            seconds = 0;
        } else {
            seconds = _seconds;
        }
        return seconds;
    }

    public void displayTime() {
        System.out.println("Current time is: " + hours + ":" + minutes + ":" + seconds);
    }
}
