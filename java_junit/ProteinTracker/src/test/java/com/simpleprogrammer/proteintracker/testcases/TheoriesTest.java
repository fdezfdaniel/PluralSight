package com.simpleprogrammer.proteintracker.testcases;

import static org.junit.Assert.assertTrue;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import com.simpleprogrammer.proteintracker.TrackingService;

@RunWith(Theories.class)
public class TheoriesTest {
	@DataPoints
	public static int[] data() {
		return new int[] { 1, 5, 10, 20, 50, 4 };
	}
	
	@Theory
	public void positiveValiesShouldAlwaysHavePositiveTotals(int value) {
		TrackingService service = new TrackingService();
		service.addProtein(value);
		assertTrue(service.getTotal() > 0);
	}

}
