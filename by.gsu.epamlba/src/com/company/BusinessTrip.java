package com.company;
import java.io.*;
public class BusinessTrip {
    private String account;
    private int expenses;
    private int days;
    private final static int DAILY_RATE = 500;
    public int getExpenses() {
        return expenses;
    }

    public BusinessTrip(String account, int expenses, int days) {
        this.account = account;
        this.expenses = expenses;
        this.days = days;
    }
    public BusinessTrip(){

    }

    public void setDays(int days) {
        this.days = days;
    }

    public void setExpenses(int expenses) {
        this.expenses = expenses;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getDays() {
        return days;
    }

    public String getAccount() {
        return account;
    }

    public int getTotal(){
    return (expenses+(DAILY_RATE*days));
    }
    public void show(){
        System.out.println("account = "+account);
        System.out.println("rate = "+DAILY_RATE);
        System.out.println("days = "+days);
        System.out.println("expenses = "+expenses);
        System.out.println("total = "+getTotal());
    }

    @Override
    public String toString() {
        return account + ";" + DAILY_RATE + ";" + days + ";" + expenses + ";" + getTotal();
    }
}

