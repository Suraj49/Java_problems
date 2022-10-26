package Level_01;

import java.util.Scanner;

/*
Q21. Write a java program to print prime numbers upto user entered value?
Explanation: Prime number is a number that is greater than 1 and divided by only 1 or itself.

Input: 20

Output: 2 3 5 7 11 13 17 19
 */
public class Q21 {
    public static boolean isPrime(int n){
        int count=0;
        if (n<=1){
            return false;
        }
        else {
            for (int i=2;i<=n/2;i++){
                if(n%i==0){
                    count++;
                }
            }
            if (count>0){
                return false;
            }
            else {
                return true;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            boolean b=isPrime(i);
            if(b){
                System.out.println(i);
            }
        }
    }
}
