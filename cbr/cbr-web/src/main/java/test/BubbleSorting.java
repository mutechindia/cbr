package test;

import java.util.Arrays;

public class BubbleSorting {
	public static int[] doSelectionSort(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++) 
			{
				count++;
				if (arr[j] < arr[index])
					index = j;
			}
			int smallerNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallerNumber;
		}
		System.out.println(count);
		return arr;
	}
	public static int[] doInsertionSort(int[] input){
        
        int temp;
        int count=0;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                count++;
            	if(input[j] < input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        System.out.println(count);
        System.out.println();
        return input;
    }

	public static void main(String[] args) {
		int count = 0;
		int i[] = { 10, 34, 2, 56, 7, 41 };
		int p;
		for (int j2 = 0; j2 < i.length; j2++) {
			for (int k = 0; k < i.length - 1; k++) {
				count++;
				if (i[j2] < i[k]) {
					p = i[j2];
					i[j2] = i[k];
					i[k] = p;
				}

			}
		}
		System.out.println(count);
		for (int j = 0; j < i.length; j++) {
			System.out.print(i[j] + " ");
		}
		System.out.println();

		int[] arr1 = { 47, 60, 34, 2, 56, 700, 12, 12 };
		int[] arr2 = doSelectionSort(arr1);
		for (int ii : arr2) {
			System.out.print(ii);
			System.out.print(", ");
		}
		System.out.println();
		int[]arry3=doInsertionSort(arr1);
		for (int ii : arry3) {
			System.out.print(ii);
			System.out.println();
		}
		int num= -10000000;
		System.out.print(num);
	}
	
	
}
