package com.example.project;
import java.util.*;

public class CalendarTester {


    public static void main(String[] args) {


        //This constructs a GregorianCalendar object
        GregorianCalendar myCal = new GregorianCalendar();
        GregorianCalendar todayDate = new GregorianCalendar(2020, Calendar.SEPTEMBER, 23);
        int dayOfMonth = todayDate.get(Calendar.DAY_OF_MONTH);
        int month = todayDate.get(Calendar.MONTH);
        int year = todayDate.get(Calendar.YEAR);
        int weekday = todayDate.get(Calendar.DAY_OF_WEEK);
        System.out.println("Today's date is: ");
        System.out.println("day of week: ");
        System.out.println(weekday);
        System.out.println("*note that Sunday is 1...");
        System.out.print(month);
        System.out.print("/ ");
        System.out.print(dayOfMonth);
        System.out.print("/ ");
        System.out.println(year);
        System.out.println("Expected month: 8 (because January is 0)");
        System.out.println("Expected Day of month: 23");
        System.out.println("Expected year: 2020");
        todayDate.add(Calendar.DAY_OF_MONTH, 100);
        System.out.println("The date that is 100 days from today is: ");
        int dayOfMonth2 = todayDate.get(Calendar.DAY_OF_MONTH);
        int month2 = todayDate.get(Calendar.MONTH);
        int year2 = todayDate.get(Calendar.YEAR);
        int weekday2 = todayDate.get(Calendar.DAY_OF_WEEK);
        System.out.println(weekday2);
        System.out.print(month2);
        System.out.print("/ ");
        System.out.print(dayOfMonth2);
        System.out.print("/ ");
        System.out.println(year2);
        System.out.println("The weekday of your birthday is: ");
        GregorianCalendar birthDay = new GregorianCalendar(2020, Calendar.SEPTEMBER, 27);
        int birthDayofMonth= birthDay.get(Calendar.DAY_OF_WEEK);
        System.out.println(birthDayofMonth);
        birthDay.add(Calendar.DAY_OF_MONTH, 10000);
        System.out.println("the date that is 10000 days from your birthday is: ");
        int birthDayofMonth2 = birthDay.get(Calendar.DAY_OF_MONTH);
        int birthMonth2 = birthDay.get(Calendar.MONTH);
        int birthYear2 = birthDay.get(Calendar.YEAR);
        int birthWeekday2 = birthDay.get(Calendar.DAY_OF_WEEK);
        System.out.println(birthWeekday2);
        System.out.print(birthMonth2);
        System.out.print("/ ");
        System.out.print(birthDayofMonth2);
        System.out.print("/ ");
        System.out.print(birthYear2);












        /* You can use constants with the GregorianCalendar class to refer to its various
         * variables.  For example, "Calendar.MONTH" is a variable that refers to the
         * month of the calendar.  This can be used with the .get() method to test
         * the calendar.  Consider the example:
         * */

        //Call the .get method on myCal using Calendar.DAY_OF_WEEK as the argument



        //Write similar tests for month, year and day of month.


        //Call the .add method to add 100 days to myCal.  Then, check the date and weekday of this new date.
        // To see that it is correct, check out this calendar calculator:
        //http://www.timeanddate.com/date/dateadd.html


        //Finally, find what day of the week is 10,000 days after your 2020 birthday. Note, you may have to play around
        //with adding or subtracting days to get to your birthday date (hmm, how can you subtract days?)


    }

}