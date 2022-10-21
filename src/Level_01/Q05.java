package Level_01;

import java.util.Scanner;

/*
Q5. Write a java program to read a length of a pipe from user in terms of CentiMeter and print the
length in Foot and Meter? Explanation: You have to take input from user as length of pipe in centimeter and then convert it to foot and meter and print it.
1 meter 100 centimeter
1 foot = 30.48 centimeter
Input: 100
Output:
In Meter = 1meter
In Foot 3.28 Foot
 */
public class Q05 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        float centimeter=scn.nextFloat();
        float meter=centimeter/100;
        float foot=centimeter/30.48f;
        System.out.println("In Meter = "+meter+" meter");
        System.out.println("In Foot = "+foot+" foot");
    }
}
