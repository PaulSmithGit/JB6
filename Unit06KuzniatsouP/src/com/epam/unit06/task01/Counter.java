package com.epam.unit06.task01;

public class Counter {
    private int count;
    private int minLimit;
    private int maxLimit;


    public Counter() {
        minLimit = 3;
        maxLimit = 99;
        count = minLimit;
    }

    public Counter(int _minLimit, int _maxLimit) {
        if (_minLimit >= _maxLimit) {
            throw new RuntimeException("Number beyond counter limits");
        }
        minLimit = _minLimit;
        maxLimit = _maxLimit;
        count = _minLimit;
    }

    public Counter(int _minLimit, int _maxLimit, int initialNumber) {
        if (_minLimit >= _maxLimit) {
            throw new RuntimeException("Number beyond counter limits");
        }
        minLimit = _minLimit;
        maxLimit = _maxLimit;
        count = initialNumber;
    }

    //Increase method
    public int increaseCount() {
        if (count == maxLimit) {
            System.out.println("Unable to increase anymore. Initial number exceeds the limit.");
        } else {
            int increase = count++;
        }

        return count;

    }

    //Deacrease method
    public int decreaseCount() {
        if (count == minLimit) {
            throw new RuntimeException("Unable to deacrease anymore. Initial number is less than the limit");
        }
        count--;
        return count;
    }

    //Current state method
    public int getCount() {
        return count;
    }

    public int getMinLimit() {
        return minLimit;
    }

    public int getMaxLimit() {
        return maxLimit;
    }
}