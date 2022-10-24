package Level_01;

import java.util.Scanner;

/*
Q16. Write a java program to read day number from user and print the corresponding day name?
Explanation: You have to take an integer from user as input and then print there corresponding
Day name.
Input: 1
Output: Sunday
Input: 4
Output: Wednesday
 */
public class Q16 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        if(n>0&&n<=7){
            switch (n){
                case 1:
                    System.out.println("Sunday");
                    break;
                case 2:
                    System.out.println("Monday");
                    break;
                case 3:
                    System.out.println("Tuesday");
                    break;
                case 4:
                    System.out.println("Wednesday");
                    break;
                case 5:
                    System.out.println("Thursday");
                    break;
                case 6:
                    System.out.println("Friday");
                    break;
                case 7:
                    System.out.println("Saturday");
                    break;
            }
        }
    }
}
