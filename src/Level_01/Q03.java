package Level_01;

import java.util.Scanner;

/*
* 03. Write a java program to read length and breathe of a rectangle from user and print area and perimeter of rectangle?
Explanation You have to take two inputs from user as length and breathe and then use them to
calculate the area and perimeter of rectangle. Area of rectangle: length
* breathe Perimeter of rectangle : 2[length + breathe)
Input: 57
Output:
Area: 35
Perimeter: 24
* */
public class Q03 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the length: ");
        int length=scn.nextInt();
        System.out.println("Enter the breathe: ");
        int breathe=scn.nextInt();
        int Area= length*breathe;
        int Perimeter=(length + breathe)*2;
        System.out.println("Area: "+Area);
        System.out.println("Perimeter: "+Perimeter);
    }
}
