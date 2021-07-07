package com.epam.unit06.task01;

public class task01 {

    public static void main(String[] args) {
        Counter res = new Counter(3, 100,100);
        System.out.println("Current counter value = " + res.getCount());
        System.out.println("Increased by 1 = " + res.increaseCount());
        System.out.println("Decreased by 1 = " + res.decreaseCount());
        System.out.println("Minimal limit = " + res.getMinLimit());
        System.out.println("Maximal limit = " + res.getMaxLimit());
    }
}
