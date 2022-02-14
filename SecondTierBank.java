package com.company;

public class SecondTierBank extends NationalBank {
    final private double fixedBankReward = 0.02;
    final private double fixedInterestRate =0.03;
    @Override
    public double deposit(double money, int duration, int client) {
        return deposit(super.deposit(money, duration, client), duration);
    }

    @Override
    public double credit(double money, int duration, int client) {
        return credit(super.credit(money, duration, client), duration);
    }

    @Override
    public double deposit(double S, int duration) {
        if (duration > 12) {
            return S + S * fixedBankReward;}
        else {return S;}
    }

    @Override
    public double credit(double C, int duration) {
        if (duration > 12) {
            return C + C * fixedInterestRate;}
        else {return C;}
    }
}