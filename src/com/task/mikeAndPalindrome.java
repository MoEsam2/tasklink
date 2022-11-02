package com.task;

import java.util.Scanner;

public class mikeAndPalindrome {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int count=0;
        int size=s.length()-1;
       for(int i=0; i<=size ;i++,size--)
       {
           if(s.charAt(i)!=s.charAt(size))
               count++;


       }
       if(count==1 || count<=1&&s.length()%2==1)
           System.out.println("YES");
       else
           System.out.println("NO");
    }
}
