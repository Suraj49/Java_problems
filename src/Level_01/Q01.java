package Level_01;

/*Q1. Write a java program to read name, mobile number, 10th percentage, 12th percentage and degree percentage and print in following format:
Enter the mobile number: 7653983721
i/p:
Enter the name: Ramesh
Enter 10th percentage:78.76
Enter 12th percentage:68.56
Enter Degree percentage:68.56
o/p:
Name: Ramesh
Mobile Number: 7653983721
10th:78.76
12th:68.56
Degree: 68.56
 */


import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name=scn.next();
        System.out.println("Enter the mobile number: ");
        long mob=scn.nextLong();
        System.out.println("Enter 10th percentage: ");
        Double percentage10=scn.nextDouble();
        System.out.println("Enter 12th percentage: ");
        Double percentage12=scn.nextDouble();
        System.out.println("Enter Degree percentage: ");
        Double percentageDeg=scn.nextDouble();
        System.out.println("Name: "+name);
        System.out.println("Mobile Number: "+mob);
        System.out.println("10th: "+percentage10);
        System.out.println("12th: "+percentage12);
        System.out.println("Degree: "+percentageDeg);

    }
}
