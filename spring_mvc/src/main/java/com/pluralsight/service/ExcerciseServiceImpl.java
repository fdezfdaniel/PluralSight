package com.pluralsight.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pluralsight.model.Activity;

@Service("exerciseService")
public class ExcerciseServiceImpl implements ExerciseService {

	public List<Activity> findAllActivities() {
		List<Activity> activitesList = new ArrayList<Activity>();
		Activity run = new Activity();
		run.setDescription("run");
		activitesList.add(run);

		Activity bike = new Activity();
		bike.setDescription("bike");
		activitesList.add(bike);

		Activity swim = new Activity();
		swim.setDescription("swim");
		activitesList.add(swim);
		return activitesList;
	}

}
