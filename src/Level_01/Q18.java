package Level_01;

import java.util.Scanner;

/*
Q18. Write a java program to read the year value from the user and print it is a leap year or not?
Explanation: Take input from user as year and print that year is leap year or not.
That number should be divisible by 4 and 400 to be leap year.
Input: 1600
Output: Leap Year
Input: 1700
Output: Not a leap year
 */
public class Q18 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter Year: ");
        int x=scn.nextInt();
        if(x%400==0||(x%4==0&&x%100!=0)){
            System.out.println("Leap Year");
        }else {
            System.out.println("Not a leap year");
        }
    }
}
