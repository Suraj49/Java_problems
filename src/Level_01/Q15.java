package Level_01;

import java.util.Scanner;

/*
Q15. Write a java program to read three integer value from the user and print the biggest value?
 Explanation: You have to take three integer value from user as input and perform operation to find biggest among them.
Input: 12 45 34

Output: 45
 */
public class Q15 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt();
        int n2=scn.nextInt();
        int n3=scn.nextInt();
        if(n1>n2&&n1>n3){
            System.out.println(n1);
        } else if (n2>n1&&n2>n3) {

            System.out.println(n2);
        }else {
            System.out.println(n3);
        }
    }
}
