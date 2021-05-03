package com.flyhub.idea_ms.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Idea {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

}
