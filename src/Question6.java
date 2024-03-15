// Write a program to get a weekday from user as input and print the ASCII
// value of 1st character of the weekday. If user has provided an invalid input, print "Invalid".
// Sample Input: Sunday
// Sample Output: 115

import java.util.Scanner;
public class Question6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String weekday = input.nextLine();
        char word = weekday.charAt(0);
        int ascii = (int) word;
        System.out.println(ascii);
        // Invalid input
        if (ascii < 65 || ascii > 122) {
            System.out.println("Invalid");
        }
    }
}