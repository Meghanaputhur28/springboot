package com.example.demo;

import java.util.*;
import java.io.*;

public class Main {
	public static int[] weirdSum(int N, int A[]) {
		int result[] = new int[N];

		// Compute the total sum of the array
		int totalSum = 0;
		for (int i = 0; i < N; i++) { 
			totalSum += A[i];
		}

		// Compute the weird-sum for each element
		for (int i = 0; i < N; i++) {
			result[i] = totalSum - A[i];
		}

		return result;
	}

	// Non-editable main function
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt(); // Fixed indexing issue
		}

		int[] result = weirdSum(N, A);

		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]); // Fixed loop condition
		}

		sc.close(); // Moved outside the loop
	}
}