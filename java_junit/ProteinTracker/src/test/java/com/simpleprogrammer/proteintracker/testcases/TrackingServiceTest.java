package com.simpleprogrammer.proteintracker.testcases;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.rules.ExpectedException;

import com.simpleprogrammer.proteintracker.TrackingService;
import com.simpleprogrammer.proteintracker.categories.GoodCategory;
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
	@Category(GoodCategory.class)
	public void newTrackingServiceTotalIsZero() {
		TrackingService service = new TrackingService();
		assertEquals("Tracking service total was not zero", 0, service.getTotal());
	}

	@Test
	@Category(GoodCategory.class)
	public void whedAddingProteinTotalIncreasesByThatAmount() {
		TrackingService service = new TrackingService();
		service.addProtein(10);
		assertEquals("Protein amount was not correct", 10, service.getTotal());
		assertThat(service.getTotal(), is(10));
	}

	@Test
	// @Ignore
	public void whenRemovingProteinTotalRemainsZero() {
		service.removeProtein(5);
		assertEquals(0, service.getTotal());
	}

	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void whenGoalIsSetToLessThenZeroExceptionIsThrownMessage() throws InvalidGoalException {
		thrown.expect(InvalidGoalException.class);
		thrown.expectMessage("Goal was less than zero");
		service.setGoal(-2);
	}
	
	
	@Test(expected = InvalidGoalException.class)
	@Category(GoodCategory.class)
	public void whenGoalIsSetToLessThenZeroExceptionIsThrown() throws InvalidGoalException {
		service.setGoal(-2);
	}
	
	
	
	@Test(timeout=200)
	@Ignore
	public void timeOutBadTest() {
		for(int i=0;i<10000000;i++)
			service.addProtein(1);
	}

}
