package application;

import models.entities.Account;
import models.exceptions.DomainExceptions;

import java.security.DomainCombiner;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("BANCO DO MATEUS");
            System.out.println("----------------------------------");
            System.out.println("Enter account data");
            System.out.print("Number");
            int number = sc.nextInt();
            System.out.print("Holder");
            String holder = sc.next();
            System.out.println("Initial Balance");
            double balance = sc.nextDouble();
            System.out.println("WithDraw limit");
            double withdraw = sc.nextDouble();

            Account account = new Account(number, holder, balance, withdraw);

            System.out.println("-----------------");
            System.out.println("Enter amount for withdraw");
            double amount = sc.nextDouble();

            account.withdraw(amount);
        } catch (DomainExceptions e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }


        sc.close();


    }
}
