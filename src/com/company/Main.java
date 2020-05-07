package com.company;

public class Main {

    public static void main(String[] args) {
    BankAccount bankAccount= new BankAccount();
    bankAccount.deposit(10000);
    while (true){
        try {
            System.out.println("На вашем счету "+ bankAccount.getAmount());
            bankAccount.withDraw(6000);
        } catch ( LimitException e) {
            System.out.println(e.getMessage());
            try{
                bankAccount.withDraw((int)bankAccount.getAmount());
            }catch (LimitException ex) {
                ex.printStackTrace();
            } break;
        }
    }
        System.out.println("На вашем счету "+ bankAccount.getAmount());
    }


}
