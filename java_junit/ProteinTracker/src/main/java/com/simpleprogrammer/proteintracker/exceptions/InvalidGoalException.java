package com.simpleprogrammer.proteintracker.exceptions;

public class InvalidGoalException extends Exception {
	private static final long serialVersionUID = -3014114492140667563L;
	
	public InvalidGoalException(String message) {
		super(message);
	}

}