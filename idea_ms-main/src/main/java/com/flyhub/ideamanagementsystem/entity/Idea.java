package com.flyhub.ideamanagementsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="idea")
public class Idea {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "idea_title")
	private String idea_title;
	
	@Column(name="date_of_submission")
	private String date_of_submission;
	
	@Column(name = "idea_description")
	private String idea_description;
	

	public Idea() {
		
	}
	
	

	
	  public Idea(long id, String idea_title, String date_of_submission, String
	  idea_description) { this.id = id; this.idea_title = idea_title;
	  this.date_of_submission = date_of_submission; this.idea_description =
	  idea_description; }
	 
	
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getIdea_title() {
		return idea_title;
	}

	public void setIdea_title(String idea_title) {
		this.idea_title = idea_title;
	}

	public String getDate_of_submission() {
		return date_of_submission;
	}

	public void setDate_of_submission(String date_of_submission) {
		this.date_of_submission = date_of_submission;
	}

	public String getIdea_description() {
		return idea_description;
	}

	public void setIdea_description(String idea_description) {
		this.idea_description = idea_description;
	}



}
