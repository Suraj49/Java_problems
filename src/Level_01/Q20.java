package Level_01;

import java.util.Scanner;

/*
Q20. Write a java program to read an integer from user and print upto that integer the fibonnaci series?
Explanation: It is a series in which the next integer is the sum of previous two integer
i.e. the third element of series is the addition of first two element of the series. And the first and second element of series are fixed i.e. 0 & 1.
Series always start from 01

Input: 15

Output: 0 1 1 2 3 5 8 13
 */
public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, n;
        int a = 0;
        int b = 1;
        System.out.println("Enter the nth value: ");
        n = sc.nextInt();
        System.out.println("Fibonacci series: ");
        while (sum <= n) {
            System.out.print(sum + " ");
            a = b;  // swap elements
            b = sum;
            sum = a + b;
        }
    }
}
