package org.example.GBrains.task1;

public class Buyer {
    private final Sex sex;

    public Sex getSex() {
        return sex;
    }

    public enum Sex {
        MALE, FEMALE;
    }

    public Buyer(Sex shosenSex) {
        this.sex = shosenSex;
    }
}
