package Level_01;

import java.util.Scanner;

/*
Q19. Write a java program to read three distinct integer value from user and print the middle
value
Explanation: Take three input value from user and check whether they are distinct or not.
If distinct then print the middle value.

Input: 23 56 34
Output: 34
Input: 23 34 23
Output: Please enter distinct values
 */
public class Q19 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt();
        int n2=scn.nextInt();
        int n3= scn.nextInt();
        if(n1!=n2 && n1!=n3 && n2!=n3) {
            if (n1 > n2 && n1 < n3) {
                System.out.println(n1);
            }
            if (n2 > n1 && n2 < n3) {
                System.out.println(n2);
            }
            if (n3 > n2 && n3 < n1) {
                System.out.println(n3);
            }
        }else {
            System.out.println("Please enter distinct values");
        }
    }
}
