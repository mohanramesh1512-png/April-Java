package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Smith",26);
        Person p2 = new Person("Kathy",25);
        Details a1 = new Details(p1,2000);
        Details a2 = new Details(p2,3000);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println("________________________________________________________");
        a1.deposite(2000);
        a2.withdraw(2000);
        System.out.println("________________________________________________________");



        System.out.println("Updated account Details");
        System.out.println("________________________________________________________");
        System.out.println(a1);
        System.out.println(a2);
    }
}