package com.simpleprogrammer.proteintracker.ProteinTracker;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.simpleprogrammer.proteintracker.TrackingService;
import com.simpleprogrammer.proteintracker.exceptions.InvalidGoalException;

public class TrackingServiceTest {
	private TrackingService service;

	@BeforeClass
	public static void beforeClass() {
		System.out.println("BeforeClass");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("AfterClass");
	}

	@Before
	public void setUp() {
		System.out.println("Before");
		service = new TrackingService();
	}

	@After
	public void tearDown() {
		System.out.println("After");
	}

	@Test
	public void newTrackingServiceTotalIsZero() {
		TrackingService service = new TrackingService();
		assertEquals("Tracking service total was not zero", 0, service.getTotal());
	}

	@Test
	public void whedAddingProteinTotalIncreasesByThatAmount() {
		TrackingService service = new TrackingService();
		service.addProtein(10);
		assertEquals("Protein amount was not correct", 10, service.getTotal());
	}

	@Test
	// @Ignore
	public void whenRemovingProteinTotalRemainsZero() {
		service.removeProtein(5);
		assertEquals(0, service.getTotal());
	}

	@Test(expected = InvalidGoalException.class)
	public void whenGoalIsSetToLessThenZeroExceptionIsThrown() throws InvalidGoalException {
		service.setGoal(-2);
	}
	
	@Test(timeout=200)
	public void timeOutBadTest() {
		for(int i=0;i<10000000;i++)
			service.addProtein(1);
	}

}
