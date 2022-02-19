package Github_upload;
/*
Given an array arr[] of size N where every element is in the range from 0 to n-1.
 Rearrange the given array so that arr[i] becomes arr[arr[i]].

Example 1:

Input:
N = 2
arr[] = {1,0}
Output: 0 1
Explanation:
arr[arr[0]] = arr[1] = 0.
arr[arr[1]] = arr[0] = 1.

Example 2:

Input:
N = 5
arr[] = {4,0,2,1,3}
Output: 3 4 2 0 1
Explanation:
arr[arr[0]] = arr[4] = 3.
arr[arr[1]] = arr[0] = 4.
and so on.
 */

import java.util.Scanner;

public class main12{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        int arr1[]=new int[n];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        try{
            for (int i = 0; i <arr1.length ; i++) {
                if (arr[i]>=arr.length){
                    throw new ArrayIndexOutOfBoundsException("abc");
                }else
                {
                    arr1[arr[i]] =arr[arr[arr[i]]];
                }
            }
            for (int i = 0; i < arr1.length; i++) {
                System.out.print(arr1[i] + " ");
            }
        }catch (ArrayIndexOutOfBoundsException obj){
            System.out.println(obj);
        }

    }
}
