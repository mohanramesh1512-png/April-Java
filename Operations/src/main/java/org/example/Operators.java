package org.example;

import java.util.LinkedHashSet;
import java.util.Set;

public class Operators {
    public String stringManupulation(String s,int  option) {
        String s1 ="";
        if(option == 1) {
            s1 =  s.concat(s);
        }else if(option == 2) {
            for(int i =0;i < s.length();i++) {
                if(i%2 != 0) {
                    s1+="#";
                }else {
                    s1+=s.charAt(i);
                }
            }
        }else if(option == 3) {
            char[] chars = s.toCharArray();
            Set<Character> charset = new LinkedHashSet<Character>();
            for(char c : chars){
                charset.add(c);
            }
            StringBuilder sb = new StringBuilder();
            for(Character character : charset){
                sb.append(character);
            }
            return sb.toString();
        }else if(option == 4){
            for(int i =0;i < s.length();i++) {
                String s2 = ""+ s.charAt(i);
                if(i%2 != 0) {
                    s1+=s2.toUpperCase();
                }else {
                    s1+=s.charAt(i);
                }
            }

        }else {
            System.out.println("Enter Correct choice");
        }

        return s1;

    }
}
