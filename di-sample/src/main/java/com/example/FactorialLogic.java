package com.example;

import org.springframework.stereotype.Component;

@Component
public class FactorialLogic {

	public int getFactorial(int num) {
		int answer = 1;

		for (int i = 1; i <= num; i++) {
			answer *= i;
		}

		return answer;
	}
}
