/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication27;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class JavaApplication27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner proyecto=new Scanner (System.in);
        int x;
       
        do{
             System.out.println("numero entre 1 y 10:");
        x=proyecto.nextInt();
        } while (x<=0 && x>=10);
       
            
            for (int i = 1; i <= 10; i++) {
                System.out.println(x +"X"+i+"="+x*i);
          
            } 
        
        }
            
        
    }
    

