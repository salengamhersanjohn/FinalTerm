

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
public class ActivityForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] grade = new double[5];
        String[] subjects = {"Math", "English", "History", "Science", "Programming"};
        
        //INPUT GRADE
        System.out.println("Please enter the grades of the subjects: ");
        double grades; 
        for (int i = 0; i < subjects.length; i++){
            
            do {
                 System.out.print(subjects[i] + ":"); 
            while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input please enter grade " + subjects[i]);
            scanner.next();
            } 
           // GRADES SHOULD BE 65 TO 100
        grades = scanner.nextDouble();
        if (grades < 65 || grades > 100) {
             System.out.println("Invalid grade please enter a value from 65 - 100");
        }
        }
        while (grades < 65 || grades > 100);       
        grade[i] = grades;
        
            
            
            
        }
        
        
        System.out.println("\nGrades of the Subject:");
        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i] + " : " + grade[i]);
        }
        // GET THE AVERAGE
         System.out.println("total no. of Subject: " + grade.length);
            int totalSum = 0;
            for (int i = 0; i < grade.length; i++) {
                totalSum += grade[i];

            }
            double average = (double)totalSum / grade.length;
            System.out.printf("Total Average: %.2f", average);
            
            // GRADE CLASSIFICATION
        System.out.println("\nGrade Classification: ");
        for (int i = 0; i < grade.length; i++) {
            char gradesClassification;
            if (grade[i] >= 90) {
                gradesClassification = 'A';
            } else if (grade[i] >= 80){
                gradesClassification = 'B';
            } else if (grade[i] >= 70){
                gradesClassification = 'C';
            } else {
                gradesClassification = 'F';
        }  
        System.out.println(subjects[i] + ":" + grade[i] + "-> " + gradesClassification);
       
        }
        
        // CHECK THE SUBJECT BELOW 75
        System.out.println("Subjects with grades below 75");
        for (int i = 0; i < subjects.length; i++) {
            if (grade[i] < 75){
                 System.out.print("\n" + subjects[i] + " : " + grade[i]);
            }  
            // "\n%.2f : .%2f", subjects[i],grade[i]
            // "\n" + subjects[i] + " : " + grade[i]
        }
        
        double maxGrade = grade[0];
        double minGrade = grade[0];
        String maxSubjects = subjects[0];
        String minSubjects = subjects[0];
        
        for (int i = 1; 1 < grade.length; i++) {
            if (grade[i] > maxGrade) {
                maxGrade = grade[i];
                maxSubjects = subjects[i];
            }
        }
        
        System.out.println("\nHighest grade: " + maxSubjects + " : " + maxGrade);

        
         
        for (int i = 1; i > grade.length; i++) {
            if (grade[i] < minGrade) {
                minGrade = grade[i];
                minSubjects = subjects[i];
            }
        }
        
        System.out.println("\nLowest grade: " + minSubjects + " : " + minGrade);

        scanner.close();
    }
}
