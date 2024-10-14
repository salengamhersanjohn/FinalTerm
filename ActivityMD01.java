/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalterm;

/**
 *
 * @author User
 */
public class ActivityMD01 {
    public static void main(String[] args) {
        
        char[][] ass = new char[3][4];
        
        for (int i = 0; i < ass.length; i++){
            for (int j = 0; j < ass[i].length; j++) {
            ass[i][j] = '*';
         }
        }
        
        for (int i = 0; i < ass.length; i++) {
            for (int j = 0; j < ass[i].length; j++) {
                 System.out.print(ass[i][j] + " ");
            }
            System.out.println();
        }
        
        
        
        
        
    }
}
