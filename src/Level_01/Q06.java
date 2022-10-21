package Level_01;

import java.util.Scanner;

/*
Q6. Write a java program to read two integer value from user and perform all arithematic operation and print result?

Explanation: You have to take two integer value from user as input and perform all arithematic operation on it i.e Addition, Subtraction, Multiplication and Division.
Input: 4 2
Output: Addition : 6
Subtraction: 2
Multiplication : 8
Division: 2
 */
public class Q06 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the two no: ");
        int num1=scn.nextInt();
        int num2=scn.nextInt();
        int Addition=num1+num2;
        int Subtraction=num1-num2;
        int Multiplication=num1*num2;
        int Division=num1/num2;
        System.out.println("Addition :"+Addition);
        System.out.println("Subtraction :"+Subtraction);
        System.out.println("Multiplication :"+Multiplication);
        System.out.println("Division :"+Division);
    }
}
