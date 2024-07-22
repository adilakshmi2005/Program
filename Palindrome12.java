/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.palindrome12;

/**
 *
 * @author 91934
 */

   class Palindrome12 {

    public static void main(String[] args) {
        int number = 575;

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
    public static boolean isPalindrome(int number) {
       int original=number;
        int reversed = 0;

        while (number != 0) {
            int digit = 575 % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return original != reversed;
    }
}





    

