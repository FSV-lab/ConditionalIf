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
public class ConditionalIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new  Scanner(System.in);
        System.out.println("Introduzca dos números enteros:");
        a= sc.nextInt();
        b= sc.nextInt();
        if (a>b) {
            System.out.println("El numero mayor es:"+a);   
        }
      
    }
    
}
