package Level_01;

import java.util.Scanner;

/*
Q14. Write a java program to calculate the simple interest of the amount which is given by user?

Explanation: You have to take three input from user one is the amount second is the interest rate and third is the time period i.e.
how many year later you will pay.And then perform operation to calculate simple interest.(Take all has double datatype)
S.I. Amount * (1+ (Interest*Time) / 100)

Input: 5000(Amount) 15 (Interest Rate) 1(Time Period)

Output: 750.0
 */
public class Q14 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int amount=scn.nextInt();
        int iRate=scn.nextInt();
        int time=scn.nextInt();
        int Simple=(amount*iRate*time)/100;
        System.out.println("SI : "+Simple);
    }
}
