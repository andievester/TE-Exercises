package com.techelevator;

public class HomeworkAssignment {
	private int earnedMarks;
	private int possibleMarks;
	private String submitterName;
	
	public String getLetterGrade() {
		if ((((double)earnedMarks / possibleMarks) * 100) >= 90) {
			return "A";
		} else if ((((double)earnedMarks / possibleMarks) * 100) >= 80) {
			return "B";
		} else if ((((double)earnedMarks / possibleMarks) * 100) >= 70) {
			return "C";
		} else if ((((double)earnedMarks / possibleMarks) * 100) >= 60) {
			return "D";
		} else {
			return "F";
		}	
	}
	
	
	public HomeworkAssignment (int possibleMarks) {
		this.possibleMarks = possibleMarks;
	}
	public int getEarnedMarks() {
		return earnedMarks;
	}
	public void setEarnedMarks(int earnedMarks) {
		this.earnedMarks = earnedMarks;
	}
	public String getSubmitterName() {
		return submitterName;
	}
	public void setSubmitterName(String submitterName) {
		this.submitterName = submitterName;
	}
	public int getPossibleMarks() {
		return possibleMarks;
	}
	
	

}
