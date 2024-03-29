package edu.ufp.inf.lp2._04_Bank;

public interface AccountMoneyI {
    double deposit(double a);
    double balance();
    double withdraw(double amount);
    double transfer(AccountMoneyI destination, double amount);
}
