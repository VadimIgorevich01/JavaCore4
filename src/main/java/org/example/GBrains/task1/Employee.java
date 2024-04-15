package org.example.GBrains.task1;

public class Employee {
    public EnumSex getEmployeeSex() {
        return employeeSex;
    }

    public void setEmployeeSex(EnumSex employeeSex) {
        this.employeeSex = employeeSex;
    }

    private EnumSex employeeSex;
    private String employeeName;

    public String getEmployeeName() {
        return employeeName;
    }

    public Employee(EnumSex employeeSex, String employeeName) {
        this.employeeSex = employeeSex;
        this.employeeName = employeeName;
    }
}
