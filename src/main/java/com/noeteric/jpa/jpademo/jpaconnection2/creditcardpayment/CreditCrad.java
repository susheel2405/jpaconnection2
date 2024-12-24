package com.noeteric.jpa.jpademo.jpaconnection2.creditcardpayment;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class CreditCrad {
    private List<Transaction>transactions;
    private double annualIntrestRate;

    public CreditCrad(double annualIntrestRate){
        this.transactions = new ArrayList<>();
        this.annualIntrestRate = annualIntrestRate;
    }
    public void addTransactions(double amount, LocalDate date){
        if (transactions.size()>=10){
            System.out.println("Maximum of 10 transactions allowed");
            return;
        }
        transactions.add(new Transaction(amount,date));
        System.out.println("Transaction of R" + amount + "added on" + date);
    }
    public double calculateIntrest(Transaction transaction, LocalDate today){
        long daysBetween = ChronoUnit.DAYS.between(transaction.getDate(),today);
        double dialyRate = annualIntrestRate / 365 / 100;
        return transaction.getAmount()*dialyRate*daysBetween;
    }
    public void processPayments(){
        if (transactions.size()<10){
            System.out.println("You must have 10 transactions to proceed");
            return;
        }
        Transaction lastTransaction  = transactions.get(transactions.size()-1);
        System.out.println("Paying off the last transaction");
        System.out.println("Transaction Amount: R" + lastTransaction.getAmount());
        System.out.println("Transaction");
    }

}
