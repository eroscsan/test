package com.epam.training.test_backend.model;

import com.epam.training.test_backend.framework.CreateJSONBody;

public class Bet extends CreateJSONBody{
	
	// here comes the bet model
	private Integer id;
	private String description;
	private String type;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	private Bet() {
		
	}
	
	@Override
	public String toString() {
		return "id" + Integer.toString(id);
	}
	
	public static class Builder{
		
		private Integer id;
		private String description;
		private String type;
/*		
		public Builder(int id) {
			this.id = id;
		}
*/		
		public Builder withId(Integer id) {
			this.id = id;
			return this;
		}

		public Builder withDescription(String description) {
			this.description = description;
			return this;
		}

		public Builder withType(String type) {
			this.type = type;
			return this;
		}
		
		public Bet build() {
			Bet request = new Bet();
			request.id = this.id;
			request.description = this.description;
			request.type = this.type;
			
			return request;
			
		}
	}
		
}
