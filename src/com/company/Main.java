package com.company;

public class Main {


    public static void main(String[] args) {
        System.out.println("TESCIK");
        String s = "przykladowy string a d g";
        System.out.println(s);
        if (s == null || s.isEmpty())
            System.out.println("0");
        int a = 0;
        for (int b = 0; b < s.length(); b++) {
            if (s.charAt(b) != ' ') {
                a++;
                while (s.charAt(b) != ' ' && b < s.length() - 1) {
                    b++;
                }
            }
        }
        System.out.println(a);
        // write your code here
    }

}
