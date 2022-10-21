package Level_01;

import java.util.Scanner;

/*
Q8. Write a java program to read two integer value from user and print those two are equal or not?
Input: 4
4
Expected Output: Equal
Input: 3
5
Expected Output: Not Equal
 */
public class Q08 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt();
        int n2=scn.nextInt();
        if (n1==n2){
            System.out.println("Equal");
        }else {
            System.out.println("Not Equal");
        }
    }
}
