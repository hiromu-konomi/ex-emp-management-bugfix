package com.example.domain;

public class Development {
	private Integer developmentId;
	private String developmentName;

	@Override
	public String toString() {
		return "Employee [development_id=" + developmentId + ", development_name=" + developmentName + "]";
	}

	public Integer getDevelopmentId() {
		return developmentId;
	}

	public void setDevelopmentId(Integer developmentId) {
		this.developmentId = developmentId;
	}

	public String getDevelopmentName() {
		return developmentName;
	}

	public void setDevelopmentName(String developmentName) {
		this.developmentName = developmentName;
	}

}
