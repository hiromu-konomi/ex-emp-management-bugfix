package com.example;

public class ExerciseMath {

	public static int factorial(int n) {
		if (n <= 0) {
			throw new IllegalArgumentException();
		}

		int ans = 1;

		for (int i = 1; i <= n; i++) {
			ans *= i;
		}

		return ans;
	}
	
}
