package com.home.systemdesign.expensesharingapp.models.expense;

import com.home.systemdesign.expensesharingapp.models.ExactSplit;
import com.home.systemdesign.expensesharingapp.models.PercentSplit;
import com.home.systemdesign.expensesharingapp.models.Split;
import com.home.systemdesign.expensesharingapp.models.User;

import java.util.List;

public class PercentExpense extends Expense{
    public PercentExpense(double amount, User paidBy, List<Split> splits, ExpenseMetaData metaData) {
        super(amount, paidBy, splits, metaData);
    }

    @Override
    public boolean validate() {
        for(Split split : getSplits()){
            if(!(split instanceof PercentSplit)){
                return false;
            }
        }

        double totalPercent = 100;
        double sumSplitPercent = 0;
        for(Split split : getSplits()){
            PercentSplit percentSplit = (PercentSplit) split;
            sumSplitPercent += percentSplit.getPercent();
        }

        if(totalPercent != sumSplitPercent){
            return false;
        }

        return true;
    }


}
