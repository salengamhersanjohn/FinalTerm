/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalterm;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class ActivityArrayJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
            int[] grade = {75, 86, 84, 90, 87};
            
            System.out.println("Initial Grade: ");
            System.out.println("Subject 1: " + grade[0]);
            System.out.println("Subject 2: " + grade[1]);
            System.out.println("Subject 3: " + grade[2]);
            System.out.println("Subject 4: " + grade[3]);
            System.out.println("Subject 5: " + grade[4]);
         
            //edit 1 grade
            System.out.println("Please enter student index: ");
            int studentIndex = scanner.nextInt();
            

            //input the grade 
            System.out.print("Enter new grade: ");
            int studentGrade = scanner.nextInt();
            
            grade[studentIndex] = studentGrade;
            System.out.println("Updated Grade: ");
            System.out.println("Subject 1: " + grade[0]);
            System.out.println("Subject 2: " + grade[1]);
            System.out.println("Subject 3: " + grade[2]);
            System.out.println("Subject 4: " + grade[3]);
            System.out.println("Subject 5: " + grade[4]);
            
            System.out.println("total no. of Subject " + grade.length);
            
            int totalSum = 0;
            for (int i = 0; i < grade.length; i++) {
                totalSum += grade[i];

            }
            // get the average
            double ave = (double)totalSum / grade.length;
            
            //print
            System.out.printf("Total Average: %.2f", ave);

    }
}


//Scanner scanner = new Scanner(System.in);


        /*double balance = 1000.00; // Initial balance
        int option;

        do {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.printf("Your balance is: $%.2f\n", balance);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = scanner.nextDouble();
                    balance += deposit;
                    System.out.printf("Deposited: $%.2f\n", deposit);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = scanner.nextDouble();
                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.printf("Withdrew: $%.2f\n", withdraw);
                    } else {
                        System.out.println("Insufficient funds!");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 4);
*/