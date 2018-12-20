package com.epam.training.test_backend.model;

import java.util.Date;

import com.epam.training.test_backend.framework.CreateJSONBody;

public class Bet extends CreateJSONBody{
	
	// here comes the bet model
	private Integer id;
	private String title;
	private String type;
	private Date start;
	private Date end;
	
	
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	private Bet() {
		
	}
	
	public static class Builder{
		
		private Integer id;
		private String title;
		private String type;
		private Date start;
		private Date end;
		
		
		public Builder withID(Integer id) {
			this.id = id;
			return this;
		}

		public Builder withTitle(String title) {
			this.title = title;
			return this;
		}

		public Builder withType(String type) {
			this.type = type;
			return this;
		}

		public Builder withStart(Date start) {
			this.start = start;
			return this;
		}

		public Builder withEnd(Date end) {
			this.end = end;
			return this;
		}

		public Bet build() {
			Bet request = new Bet();
			request.id = this.id;
			request.title = this.title;
			request.type = this.type;
			request.start = this.start;
			request.end = this.end;
			
			return request;
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
