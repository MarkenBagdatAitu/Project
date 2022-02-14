 package com.company;

 public class NationalBank extends Calculate {
     private SecondTierBank secondTierBank;
     final private double fixedBankReward = 0.01;

     @Override
     public double deposit(double money, int duration, int client) {
         return deposit(super.deposit(money, duration, client), duration);
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
             return C + C * fixedBankReward;}
         else {return C;}
     }

     @Override
     public double credit(double money, int duration, int client) {
         return credit(super.credit(money, duration, client), duration);
     }

     public SecondTierBank getSecondTierBank() {return secondTierBank;}

     public void setSecondTierBank(SecondTierBank secondTierBank) {this.secondTierBank = secondTierBank;}
 }
