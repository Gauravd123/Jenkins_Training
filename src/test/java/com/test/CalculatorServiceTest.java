package com.test;

import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import services.CalculatorService;

public class CalculatorServiceTest {


	@Test
	public void addTest()
	{
		int result = CalculatorService.add(2, 3);
		int expected = 4;
		Assert.assertEquals(expected, result);
		System.out.println("Expected sum: "+expected);
	}
	
	
	@Before
	public void printDate() {
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
	}

}
