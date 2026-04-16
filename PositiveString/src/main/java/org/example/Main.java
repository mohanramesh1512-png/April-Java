package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        if(Positive(sc.nextLine())){
            System.out.println("Positive String");
        }
        else{
            System.out.println("Not Positive String");
        }
    }

    public static Boolean Positive(String s){
        if ( s == null || s.length() < 2){
            return true;
        }

        for( int i=0; i< s.length()-1; i++){
            if(s.charAt(i) >=  s.charAt(i+1)){
                return false;
            }
        }

        return true;
    }
}