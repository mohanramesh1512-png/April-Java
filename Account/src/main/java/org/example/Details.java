package org.example;

public class Details {
    private long acctNum;
    private double balance;
    private Person acctHolder;
    private static long count = 1001;
    private static final double MIN_Balance = 500;

    public Details() {
    }

    public long getAcctNum() {
        return acctNum;
    }

    public void setAcctNum(long acctNum) {
        this.acctNum = acctNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Person getAcctHolder() {
        return acctHolder;
    }

    public void setAcctHolder(Person acctHolder) {
        this.acctHolder = acctHolder;
    }

    public static long getCount() {
        return count;
    }

    public static void setCount(long count) {
        Details.count = count;
    }

    public Details(Person p1, double i) {
        this.acctNum = count++;
        this.acctHolder = p1;
        if(i >= MIN_Balance) {
            this.balance = i;
        }else {
            System.out.println("Need to deposite atleast 500 MINIMUM BALANCE");
        }
    }

    public void deposite(double bal) {
        balance+=bal;
        System.out.println(bal +" deposited succesfully");
    }

    public void withdraw(double bal) {
        if(balance - bal <= 500) {
            System.out.println("Need to keep min 500");
        }else {
            this.balance = balance - bal;
            System.out.println(bal +" Withdraw succesfully");

        }
    }

    public String toString() {
        return "acctNum=" + acctNum + ", balance=" + balance + ", acctHolder=" + acctHolder.getName();
    }

}
