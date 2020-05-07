package com.company;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }
    public void deposit(double sum) {
        amount= amount+sum;
        System.out.println(" На ваш счет поступило " + getAmount());
    }

    public void withDraw(int sum) throws LimitException {
      if (sum>amount){
          throw new LimitException(" Недостаточно средств на балансе ",  getAmount());
      } else {
          amount= amount-sum;
          System.out.println(" С вашего баланса списано " +sum);
      }
    }

}
