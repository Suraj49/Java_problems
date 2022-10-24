package Level_01;

import java.util.Scanner;

/*
Q17. Write a java program to read month number from user and print corresponding how many days are in that month?
Explanation: You have to take integer input from user as month number and print corresponding days in that month.
Input: 2
Output: 28 or 29

Input: 11
output:30
 */
public class Q17 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter month number");
        int n=scn.nextInt();
        if (n>0 && n<=12){
            if(n==1||n==3||n==5||n==7||n==8||n==10||n==12){
                System.out.println(31);
            } else if (n==4||n==6||n==9||n==11) {
                System.out.println(30);
            }else {
                System.out.println(28+" or "+29);
            }
        }
    }
}
