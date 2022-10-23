package Level_01;

import java.util.Scanner;

/*
Q13. Write a java program to read the integer value from user and print that integer is a special 2
digit number or not?
Explanation: You have to take input from user and check it whether it is an special number or not (Only two digit you have to check).
Special two digit number is a number such that when the sum of digits of the number is added to the product of its digit, the result is equal to the original number..

Example: 59:5*9=45 & 5+9=14

45+14=59 So 59 is a special number.
 */
public class Q13 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int n1=n%10;
        int n2=n/10;
        int sum=n1+n2;
        int mul=n1*n2;
        if((sum+mul)==n){
            System.out.println("Special number");
        }else {
            System.out.println("Not special number");
        }
    }
}
