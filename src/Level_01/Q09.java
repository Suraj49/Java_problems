package Level_01;

import java.util.Scanner;

/*
Q9. Write a java program to read two integer number from user and you have to print biggest among them?
Input: 3 5

Output: 5

Input: 24 150

Output: 150
 */
public class Q09 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt();
        int n2=scn.nextInt();
        if(n1>n2){
            System.out.println("bigger "+n1);
        }else {
            System.out.println("bigger "+n2);
        }
    }
}
