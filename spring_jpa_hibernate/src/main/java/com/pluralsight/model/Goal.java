package com.pluralsight.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Range;

@Entity
@Table(name = "goals")
@NamedQueries({@NamedQuery(name=Goal.FIND_GOAL_REPORTS, query="Select new com.pluralsight.model.GoalReport(g.minutes, e.minutes, e.activity)"
		+ "from Goal g, Exercise e where g.id = e.goal.id")})
public class Goal {
	public static final String FIND_GOAL_REPORTS = "findGoalReports";
	
	@Id
	@GeneratedValue
	private Long id;

	@Range(min = 1, max = 120)
	private int minutes;

	@OneToMany(mappedBy="goal", cascade=CascadeType.ALL)
	private List<Exercise> exerciesList = new ArrayList<Exercise>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public List<Exercise> getExerciesList() {
		return exerciesList;
	}

	public void setExerciesList(List<Exercise> exerciesList) {
		this.exerciesList = exerciesList;
	}

}
