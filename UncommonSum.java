/*
 * Given two integer arrays input1[] and input2[], extract the numbers which are present
only in any one of the array (Uncommon numbers).
Calculate sum of those numbers. Let call it sum1 and calculate single digit sum of sum1,
i.e., keep adding the digits of sum1 until you arrive at a single digit.
Return that single digit as output.
Note:
1. Array size ranges from 1 to 10.
2. All the array elements are positive numbers.
3. Atleast one uncommon number will be present in the arrays.
Example 1:
input1: 6
input2: 123, 45, 7890, 67, 2, 90
input3: 3
input4: {45, 7890, 123}
output: 6
Explanation:
67 + 2 + 90 = 159
1 + 5 + 9 = 15
1 + 5 = 6
 */

 import java.util.Scanner;

 public class UncommonSum {
 
     public static int singleDigitSum(int num) {
         while (num >= 10) {
             int sum = 0;
             while (num > 0) {
                 sum += num % 10;
                 num /= 10;
             }
             num = sum;
         }
         return num;
     }
 
     public static int findUncommonSum(int[] arr1, int n1, int[] arr2, int n2) {
         int sum = 0;
 
         for (int i = 0; i < n1; i++) {
             boolean isUnique = true;
             for (int j = 0; j < n2; j++) {
                 if (arr1[i] == arr2[j]) {
                     isUnique = false;
                     break;
                 }
             }
             if (isUnique) {
                 sum += arr1[i];
             }
         }
 
         for (int i = 0; i < n2; i++) {
             boolean isUnique = true;
             for (int j = 0; j < n1; j++) {
                 if (arr2[i] == arr1[j]) {
                     isUnique = false;
                     break;
                 }
             }
             if (isUnique) {
                 sum += arr2[i];
             }
         }
 
         return sum;
     }
 
     public static void main(String[] args) {
         int[] arr1 = {123, 45, 7890, 67, 2, 90};
         int[] arr2 = {45, 7890, 123};
 
         int sum1 = findUncommonSum(arr1, arr1.length, arr2, arr2.length);
         int result = singleDigitSum(sum1);
 
         System.out.println("Output: " + result);
     }
 }
 