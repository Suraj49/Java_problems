package Level_01;

import java.util.Scanner;

/*
* Q2. Write a java program to read radius from user and calculate the area and circumference a cirde?

Explanation: Formulae for Area of radius is (pie*r*r) and for Circumference is (2*pie*r).

Take radius from user as input and calculate the area and circumference.

Input: 5

Output:
Area: 78.5

Circumference: 31.4
*
* */
public class Q02 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the Radius (value of r): ");
        float r=scn.nextFloat();
        float Area=3.14f*r*r;
        float Circumference=2*3.14f*r;
        System.out.println("Area: "+Area);
        System.out.println("Circumference: "+Circumference);
    }
}
