/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factorial;

/**
 *
 * @author 91934
 */
public class Factorial { 
 public static void main(String args[]){  
  int i,fact=1;  
  int number=5;   
  for(i=1;i<=number;i++){    
      fact=fact*i;    
  }    
  System.out.println("Factorial of "+number+" is: "+fact);    
 }  
}
