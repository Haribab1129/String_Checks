/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.string_check;

/**
 *
 * @author ICX
 */
public class String_Check {

    public static void main(String[] args) {
        String sentence = "This is software world";
        String wordToCheck = "software";

        if (sentence.contains(wordToCheck)) {
            System.out.println("The word '" + wordToCheck + "' is present in the sentence.");
        } else {
                 System.out.println("The word '" + wordToCheck + "' is not present in the sentence.");
            }           
    }
}
