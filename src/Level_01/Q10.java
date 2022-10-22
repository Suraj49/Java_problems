package Level_01;

import java.util.Scanner;

/*
Q10. Write a java program to read three integer value from user and print biggest among those three integer by using simple if statement?
Explanation: You have to take three integer as input from user and use if-else condition statement to find out which integer is biggest among them.
Input: 23 45 38
Output: 45
 */
public class Q10 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt();
        int n2=scn.nextInt();
        int n3=scn.nextInt();
        if (n1>n2 && n1>n3){
            System.out.println(n1);
        }
        else if(n2>n1 && n2>n3){
            System.out.println(n2);
        }else {
            System.out.println(n3);
        }
    }
}
