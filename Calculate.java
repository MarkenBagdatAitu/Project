package com.company;

public abstract class Calculate {
    private NationalBank nationalBank;
    double money;
    int duration;
    int client;
    
    public NationalBank getNationalBank() {return nationalBank;}

    public void setNationalBank(NationalBank nationalBank) {
        this.nationalBank = nationalBank;
    }

    public double getMoney() {return money;}

    public void setMoney(double money) {this.money = money;}

    public int getDuration() {return duration;}

    public void setDuration(int duration) {this.duration = duration;}

    public int getClient() {return client;}

    public void setClient(int client) {this.client = client;}

    public double deposit(double money, int duration, int client) {
        if (client == 1) {
            return money + (money * 0.08)* (duration /12);
        } else if (client == 2) {
            return money + (money * 0.1) * (duration /12);
        }
        return 0;
    }

    public double credit(double money, int duration, int client){
        if(client == 1){
            return money + (money * 0.08) * (duration /12);
        } else if(client == 2){
            return money + (money * 0.1) * (duration/12);
        }
        return 0;
    }

    public abstract double deposit(double S, int duration);

    public abstract double credit(double C, int duration);
}

