package com.data.parrit;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Workspace {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String htmlContents;
	
	public String getHtmlContents() {
		return htmlContents;
	}
	
	public void setHtmlContents(String htmlContents) {
		this.htmlContents = htmlContents;
	}
}
