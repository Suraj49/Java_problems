package Level_01;

import java.util.Scanner;

/*
Q4. Write a java program to read a side(length) of a square and print the area and perimeter?
Explanation: You have to take one input from user as length or side of square and use it to calculate the area and perimeter of the square.
Area of square: side*side , Perimeter of square: 4 * side.
Input: 12
Output: Area: 144
Perimeter: 48
 */
public class Q04 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int side=scn.nextInt();
        int Area=side*side;
        int Perimeter=4*side;
        System.out.println("Area: "+Area);
        System.out.println("Perimeter: "+Perimeter);
    }
}
