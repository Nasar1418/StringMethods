package com.nasarvali;
import java.util.Scanner;
public class StringMethods {
    public static void main(String[] args) {
        System.out.println("Welcome to string methods");
        int m=0;
        do {
            System.out.println("****These are the string methods****");
            System.out.println("1.length()\n2.toLowerCase\n3.toUpperCase()\n4.trim()\n5.subStringWithBeginIndex()\n6.subString With Begin and End Index\n7.replace()\n8.startsWith()\n9.endsWith()\n10.charAt()\n11.indexOf()\n12.lastIndexOf\n13.equals()\n14.equalsIgnoreCase()");
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose the method you work");
            int n = sc.nextInt();
            System.out.println("Enter the string");
            String s = sc.next();
            switch (n) {
                case 1 -> System.out.println("LENGTH =" + s.length());
                case 2 -> System.out.println("string in lowercase : " + s.toLowerCase());
                case 3 -> System.out.println("string in Upper case: " + s.toUpperCase());
                case 4 -> System.out.println("String after trim: " + s.trim());
                case 5 -> {
                    System.out.println("enter the begin index:");
                    int i = sc.nextInt();
                    System.out.println("SubString:" + s.substring(1));
                }
                case 6 -> {
                    int i, j;
                    System.out.println("enter the begin and end index");
                    i = sc.nextInt();
                    j = sc.nextInt();
                    System.out.println("substring: " + s.substring(i, j));
                }
                case 7 -> {
                    System.out.println("enter the character to replace and new character:");
                    String r = sc.next();
                    String p = sc.next();
                    System.out.println("new String:" + s.replace(r, p));
                }
                case 8 -> {
                    System.out.println("enter the starting characters to test:");
                    String r = sc.next();
                    System.out.println(s.startsWith(r));
                }
                case 9 -> {
                    System.out.println("enter the ending characters to test:");
                    String r = sc.next();
                    System.out.println(s.startsWith(r));
                }
                case 10 -> {
                    System.out.println("enter the index to get character:");
                    int r = sc.nextInt();
                    System.out.println(s.charAt(r));
                }
                case 11 -> {
                    System.out.println("enter the string to get index of first occurance in the string:");
                    String r = sc.next();
                    System.out.println(s.indexOf(r));
                }
                case 12 -> {
                    System.out.println("enter the string to get index of last occurance in the string:");
                    String r = sc.next();
                    System.out.println(s.lastIndexOf(r));
                }
                case 13 -> {
                    System.out.println("enter the string to check equal or not:");
                    String r = sc.next();
                    System.out.println(s.equals(r));
                }
                case 14 -> {
                    System.out.println("enter the string to check equal or not with ignore case sensitive:");
                    String r = sc.next();
                    System.out.println(s.equalsIgnoreCase(r));
                }
            }
            System.out.println("do yo want to continue : type (1) to continue and (0) to exit ");
            m = sc.nextInt();
        }while(m==1);
    }
}