package com.simpleprogrammer.proteintracker.testsuites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.simpleprogrammer.proteintracker.testcases.ProteinTrackerApplicationTests;
import com.simpleprogrammer.proteintracker.testcases.TrackingServiceTest;

@RunWith(Suite.class)
@SuiteClasses({ ProteinTrackerApplicationTests.class, TrackingServiceTest.class })
public class ProteinTrackerTestSuite {

}
