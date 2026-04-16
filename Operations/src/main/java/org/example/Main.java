package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operators op = new Operators();
        System.out.print("Enter a String: ");
        String s = sc.nextLine();
        System.out.println("Options: \n 1.add the string to itself \n 2.Replace odd position with # \n" +
                " 3.remove duplicate char from string \n 4.Change odd position to uppercase");
        int option = sc.nextInt();
        System.out.println(op.stringManupulation(s, option));

    }
}