package com.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TestCalculator {

	@BeforeAll // function has to be static to use before all
	public static void init() {
		System.out.println("@test executed");
	}

	@Test
	@Disabled
	public void testAdd1() {
		System.out.println("testing");
		Calculator calculator = new Calculator();
		assertEquals(8, calculator.add(4, 4));
	}

	@Test
	@Tag("DEV")
	public void testAdd() {
		System.out.println("testing");
		Calculator calculator = new Calculator();
		assertEquals(8, calculator.add(4, 4));
	}

}
