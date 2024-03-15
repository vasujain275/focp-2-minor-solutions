// WAP to check if a array is palindrome or not.

import java.util.Scanner;
public class Question9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }
        boolean isPalindrome = true;
        for (int i = 0; i < n/2; i++){
            if (arr[i] != arr[n-i-1]){
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
