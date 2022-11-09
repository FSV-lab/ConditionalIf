/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package conditionalif;

import java.util.Scanner;

/**
 *
 * @author fercho
 */
public class Conditional2 {
    public static void main(String[] args) {
     int edad;
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduzca su edad:");
    edad = sc.nextInt(); 
        if (edad>=18) {
            System.out.println("Usted es mayor de edad!");
        }else{
            System.out.println("Usted es menor de edad!");
        }
    }  
   
}
