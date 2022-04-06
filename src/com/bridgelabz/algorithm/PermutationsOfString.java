package com.bridgelabz.algorithm;

import java.util.Scanner;

public class PermutationsOfString {
    public static void main(String[] args) {
        System.out.println("Enter the string : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        permute(str,0,str.length());
    }

    private static void permute(String str, int start, int end) {
        if (start == end - 1){
            System.out.println(str);
        }else{
            for(int i = 0; i < end; i++){
                str = swapString(str,start,i);
                permute(str,start + 1,end);
                str = swapString(str,start,i);
            }
        }
    }

    private static String swapString(String string, int i, int j) {
        char temp;
        char[] charArray = string.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
