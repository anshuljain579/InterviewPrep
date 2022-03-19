package com.home.systemdesign.expensesharingapp.models.expense;

import com.home.systemdesign.expensesharingapp.models.EqualSplit;
import com.home.systemdesign.expensesharingapp.models.Split;
import com.home.systemdesign.expensesharingapp.models.User;

import java.util.List;

public class EqualExpense extends Expense{
    public EqualExpense(double amount, User paidBy, List<Split> splits, ExpenseMetaData metaData) {
        super(amount, paidBy, splits, metaData);
    }

    @Override
    public boolean validate() {
        for(Split split : getSplits()){
            if(!(split instanceof EqualSplit)){
                return false;
            }
        }
        return true;
    }
}
