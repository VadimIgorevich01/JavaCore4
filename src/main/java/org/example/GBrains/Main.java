package org.example.GBrains;
import org.example.GBrains.task1.Buyer;
import org.example.GBrains.task1.Employee;
import org.example.GBrains.task1.EnumSex;
import org.example.GBrains.task2.Manage;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Main {
    public static void main(String[] args) {
        //task1: В класс покупателя добавить перечисление с гендерами,
        // добавить в сотрудника свойство «пол» со значением созданного
        // перечисления. Добавить геттеры, сеттеры.
        Buyer buyerF = new Buyer(Buyer.Sex.FEMALE);
        Buyer buyerM = new Buyer(Buyer.Sex.MALE);
        Employee employeeF1 = new Employee(EnumSex.FEMALE, "Sveta");
        Employee employeeF2 = new Employee(EnumSex.FEMALE, "Anna");
        Employee employeeM1 = new Employee(EnumSex.MALE, "Oleg");
        Employee employeeM2 = new Employee(EnumSex.MALE, "Slava");

        // task2: Добавить в основную программу перечисление с праздниками
        // (нет праздника, Новый Год, 8 марта, 23 февраля), написать метод,
        // принимающий массив сотрудников, поздравляющий всех сотрудников
        // с Новым Годом, женщин с 8 марта, а мужчин с 23 февраля,
        // если сегодня соответствующий день.
        Employee[] employeesArray = new Employee[] {employeeF1, employeeF2, employeeM1, employeeM2};
        Manage manage = new Manage();
        Calendar womenDay = new GregorianCalendar(2024, Calendar.MARCH , 8);
        Calendar menDay = new GregorianCalendar(2024, Calendar.FEBRUARY , 23);
        Calendar newYearDay = new GregorianCalendar(2024, Calendar.DECEMBER, 31);
        Calendar someDay = new GregorianCalendar(2024, Calendar.APRIL, 11);
        manage.isHoliday(employeesArray, womenDay);
        manage.isHoliday(employeesArray, menDay);
        manage.isHoliday(employeesArray, newYearDay);
        manage.isHoliday(employeesArray, someDay);
    }
}