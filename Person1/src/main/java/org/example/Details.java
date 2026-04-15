package org.example;

import java.util.Scanner;

public class Details {

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    private String first_name;
    private String last_name;
    private Gender gender;
    private int age;
    private double weight;

    public Details(String first_name, String last_name, Gender gender, int age, double weight) {
        super();
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
    }
    public String MobileNo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Mobile Number: ");
        return sc.nextLine();
    }
    public String toString() {
        return "Personal Details\n"
                + "--------------------------\n"
                + "First Name : " + first_name + "\n"
                + "Last Name : " + last_name + "\n"
                + "Mobile Number : " + MobileNo() + "\n"
                + "Gender : " + gender + "\n"
                + "Age : " + age+"\n"
                + "Weight :" + weight;
    }
}
