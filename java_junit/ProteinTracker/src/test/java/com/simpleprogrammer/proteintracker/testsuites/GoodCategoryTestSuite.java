package com.simpleprogrammer.proteintracker.testsuites;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import com.simpleprogrammer.proteintracker.categories.GoodCategory;
import com.simpleprogrammer.proteintracker.testcases.TrackingServiceTest;

@RunWith(Categories.class)
@IncludeCategory(GoodCategory.class)
@SuiteClasses({ TrackingServiceTest.class })
public class GoodCategoryTestSuite {

}
