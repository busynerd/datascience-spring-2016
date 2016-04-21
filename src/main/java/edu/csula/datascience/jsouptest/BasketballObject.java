package edu.csula.datascience.jsouptest;

public class BasketballObject {
	
	private String team;
	private int games_played;
	private double points_per_game;
	private double field_goal_made;
	private double field_goal_attempted;
	private double field_goal_percentage;
	private double three_points_made;
	private double three_points_attempted;
	private double three_points_percentage;
	private double free_throws_made;
	private double free_throws_attempted;
	private double free_throws_percentage;
	
	public BasketballObject() {
	}
	
	public BasketballObject(String team, int games_played,
			double points_per_game, double field_goal_made,
			double field_goal_attempted, double field_goal_percentage,
			double three_points_made, double three_points_attempted,
			double three_points_percentage, double free_throws_made,
			double free_throws_attempted, double free_throws_percentage) {
		this.team = team;
		this.games_played = games_played;
		this.points_per_game = points_per_game;
		this.field_goal_made = field_goal_made;
		this.field_goal_attempted = field_goal_attempted;
		this.field_goal_percentage = field_goal_percentage;
		this.three_points_made = three_points_made;
		this.three_points_attempted = three_points_attempted;
		this.three_points_percentage = three_points_percentage;
		this.free_throws_made = free_throws_made;
		this.free_throws_attempted = free_throws_attempted;
		this.free_throws_percentage = free_throws_percentage;
	}
	
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public int getGames_played() {
		return games_played;
	}
	public void setGames_played(int games_played) {
		this.games_played = games_played;
	}
	public double getPoints_per_game() {
		return points_per_game;
	}
	public void setPoints_per_game(double points_per_game) {
		this.points_per_game = points_per_game;
	}
	public double getField_goal_made() {
		return field_goal_made;
	}
	public void setField_goal_made(double field_goal_made) {
		this.field_goal_made = field_goal_made;
	}
	public double getField_goal_attempted() {
		return field_goal_attempted;
	}
	public void setField_goal_attempted(double field_goal_attempted) {
		this.field_goal_attempted = field_goal_attempted;
	}
	public double getField_goal_percentage() {
		return field_goal_percentage;
	}
	public void setField_goal_percentage(double field_goal_percentage) {
		this.field_goal_percentage = field_goal_percentage;
	}
	public double getThree_points_made() {
		return three_points_made;
	}
	public void setThree_points_made(double three_points_made) {
		this.three_points_made = three_points_made;
	}
	public double getThree_points_attempted() {
		return three_points_attempted;
	}
	public void setThree_points_attempted(double three_points_attempted) {
		this.three_points_attempted = three_points_attempted;
	}
	public double getThree_points_percentage() {
		return three_points_percentage;
	}
	public void setThree_points_percentage(double three_points_percentage) {
		this.three_points_percentage = three_points_percentage;
	}
	public double getFree_throws_made() {
		return free_throws_made;
	}
	public void setFree_throws_made(double free_throws_made) {
		this.free_throws_made = free_throws_made;
	}
	public double getFree_throws_attempted() {
		return free_throws_attempted;
	}
	public void setFree_throws_attempted(double free_throws_attempted) {
		this.free_throws_attempted = free_throws_attempted;
	}
	public double getFree_throws_percentage() {
		return free_throws_percentage;
	}
	public void setFree_throws_percentage(double free_throws_percentage) {
		this.free_throws_percentage = free_throws_percentage;
	}

}
