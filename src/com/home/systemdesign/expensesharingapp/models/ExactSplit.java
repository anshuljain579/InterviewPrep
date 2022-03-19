package com.home.systemdesign.expensesharingapp.models;

public class ExactSplit extends Split{
    public ExactSplit(User user, double amount) {
        super(user);
        this.amount = amount;
    }
}
