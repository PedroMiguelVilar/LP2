package edu.ufp.inf.lp2._03PL;

import edu.ufp.inf.lp2._02_Collections.LottoBagArray;

public class Date {

    private short day;
    private short month;
    private int year;

    public Date(short day, short month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public Date(int day, int month, int year) {
        this.day= (short) day;
        this.month= (short) month;
        this.year=year;
    }


    public boolean beforeDate(Date d){
        return (this.day<d.day && this.month<d.month && this.year<d.year);
    }

    public boolean afterDate(Date d){
        return (this.day>d.day && this.month>d.month && this.year>d.year);
    }

    public boolean isLeapYear(){
        return this.year%4==0;
    }

    public void incrementDate(){
        this.year+=1;
        this.month+=1;
        this.day+=1;
    }

    public int differenceYears(Date d){
        return this.year-d.year;
    }

    public int differenceMonths(Date d){
        return this.month-d.month;
    }

    public int differenceDays(Date d){
        return this.day-d.day;
    }

    public int daysMonth(){
        switch(this.month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                if (isLeapYear())return 29;
                return 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 1;
        }
    }

}
