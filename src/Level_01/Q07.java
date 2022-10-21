package Level_01;

import java.util.Scanner;

/*
Q7. Write a java program to print user enter number is positive or negative or zero?
Exp
Input: -1
Expected output: Negative
Input: 5
Expected output: Positive
Input: 0
Expected Output: Zero
 */
public class Q07 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        if(n<0){
            System.out.println("Negative");
        }
        if (n>0){
            System.out.println("Positive");
        }
        if(n==0){
            System.out.println("Zero");
        }
    }
}
