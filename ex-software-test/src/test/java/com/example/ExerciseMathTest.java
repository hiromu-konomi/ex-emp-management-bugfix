package com.example;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ExerciseMathTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass()の呼出し。全テスト実行前に１度だけ実行される");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass()の呼出し。全テスト実行後に１度だけ実行される");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("setUp()の呼出し。各テスト実行前に毎回実行される");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown()の呼出し。各テスト実行後に毎回実行される");
	}

	@Test
	public void test1() {
		int actualAnswer = ExerciseMath.factorial(1);
		assertEquals("TC1:期待値と実際の結果が異なります", 1, actualAnswer);
	}
	
	@Test
	public void test2() {
		int actualAnswer = ExerciseMath.factorial(5);
		assertEquals("TC2:期待値と実際の結果が異なります", 120, actualAnswer);
	}
	
	@Test
	public void test3() {
		try {
			int actualAnswer = ExerciseMath.factorial(0);
			assertEquals("TC3:期待値と実際の結果が異なります", 0, actualAnswer);
		} catch(IllegalArgumentException ex) {
			System.out.println("IllegalArgumentException発生したよ");
		}
	}
	
	@Test
	public void test4() {
		int actualAnswer = ExerciseMath.factorial(21);
		assertEquals("TC4:期待値と実際の結果が異なります", 0, actualAnswer);
	}

}
