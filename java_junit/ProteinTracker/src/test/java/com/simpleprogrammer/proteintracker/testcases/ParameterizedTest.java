package com.simpleprogrammer.proteintracker.testcases;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.simpleprogrammer.proteintracker.TrackingService;

@RunWith(Parameterized.class)
public class ParameterizedTest {

	private static TrackingService service = new TrackingService();
	private int input;
	private int expected;

	public ParameterizedTest(int input, int expected) {
		this.input = input;
		this.expected = expected;
	}

	@Parameters
	public static List<Object[]> data() {
		return Arrays.asList(new Object[][] { { 5, 5 }, { 5, 10 }, { -12, 0 }, { 50, 50 }, { 1, 51 } });
	}
	
	@Test
	public void testUsingParamters() {
		if(input >= 0)
			service.addProtein(input);
		else
			service.removeProtein(-input);
		assertEquals(expected, service.getTotal());
	}

}
