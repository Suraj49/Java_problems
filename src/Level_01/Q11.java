package Level_01;

import java.util.Scanner;

/*
Q11. Write a java program to read the height and weight of a person from user and print the body mass index (BMI) of the person?
Explanation: You have to take two integer from user as height and weight of person and then use them to calculate BMI of that person.
BMI weight/height *height (weight is kilograms and height in meters)
Input: 64kg 1.75m
Output: BMI of person is 22.9
 */
public class Q11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the weight in KG: ");
        int weight=scn.nextInt();
        System.out.println("Enter the height in meters: ");
        float height=scn.nextFloat();
        float BMI=weight/(height*height);
        System.out.println("BMI of person is "+BMI);
    }
}
