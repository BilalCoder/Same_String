package com.company;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int len = Math.max(s1.length(), s2.length());
        int low = Math.min(s1.length(), s2.length());
        char[] chars1 = s1.toCharArray();
        Arrays.sort(chars1);
        char[] chars2 = s2.toCharArray();
        Arrays.sort(chars2);
        Set<Character> charSet = new LinkedHashSet<Character>();
        for (char c : chars1) {
            charSet.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for (Character character : charSet) {
            sb.append(character);
        }
        //System.out.println(sb.toString());

        Set<Character> charSet1 = new LinkedHashSet<Character>();
        for (char c : chars2) {
            charSet1.add(c);
        }
        StringBuilder sb1 = new StringBuilder();
        for (Character character : charSet1) {
            sb1.append(character);
        }
        //System.out.println(sb1.toString());
        if(sb.toString().equals(sb1.toString()))
            System.out.println("Same");
        else
            System.out.println("Different");
    }
}
