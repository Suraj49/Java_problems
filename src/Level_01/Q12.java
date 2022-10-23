package Level_01;

import java.util.Scanner;

/*
Q12. Write a java program to read the integer value from the user and print it is an even or odd number?
Input: 23
Output: Odd
Input: 46
Output: Even
 */
public class Q12 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        String s[]={"Even","Odd"};
        System.out.println("Number is: "+s[n%2]);
    }
}
