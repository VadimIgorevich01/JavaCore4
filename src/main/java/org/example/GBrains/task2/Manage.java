package org.example.GBrains.task2;

import org.example.GBrains.task1.Employee;
import org.example.GBrains.task1.EnumSex;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

public class Manage {
    public void isHoliday(Employee [] employeesArray, Calendar today) {
        for (int i = 0; i <employeesArray.length; i++) {
            Calendar womenDay = new GregorianCalendar(2024, Calendar.MARCH , 8);
            Calendar menDay = new GregorianCalendar(2024, Calendar.FEBRUARY , 23);
            Calendar newYearDay = new GregorianCalendar(2024, Calendar.DECEMBER, 31);
            if (employeesArray[i].getEmployeeSex() == EnumSex.FEMALE && Objects.equals(today, womenDay)) {
                System.out.println("С праздником 8го марта!, " + employeesArray[i].getEmployeeName());
            } else if (employeesArray[i].getEmployeeSex() == EnumSex.MALE && Objects.equals(today, menDay)) {
                System.out.println("С праздником 23го февраля!, " + employeesArray[i].getEmployeeName());
            } else if (Objects.equals(today, newYearDay)) {
                System.out.println("С новым годом!, " + employeesArray[i].getEmployeeName());
            } else {
                System.out.println("Нет празников для сотрудника- " + employeesArray[i].getEmployeeName());
            }
        }
        System.out.println("---------------------------------");
    }
}
