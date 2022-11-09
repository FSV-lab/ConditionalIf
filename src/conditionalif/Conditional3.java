/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package conditionalif;

import java.util.Scanner;

/**
 *
 * @author ferch
 */
public class Conditional3 {
    public static void main(String[] args) {
        double notaFinal,parcial1,parcial2,parcial3;
        Scanner sc =new Scanner(System.in);
        System.out.println("Ingrese la nota del parcial 1:");
        parcial1=sc.nextDouble();
        System.out.println("Introduzca la nota del parcial 2:");
        parcial2=sc.nextDouble();
        System.out.println("Introduzca la nota del parcial 3:");
        parcial3=sc.nextDouble();
        
        notaFinal=(parcial1*0.25)+(parcial2*0.35)+(parcial3*0.4);
        if (notaFinal>=3.5) {
            System.out.println("Su estado final es Aprobado!");
            System.out.println("La nota obtenida fue:"+notaFinal);
        }
    }
  
}
