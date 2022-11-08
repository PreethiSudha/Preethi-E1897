package com.example.demo;

import java.util.List;

public class MainJson{
	
	private List<Screen> screen;
	private String parentInstanceId;
	private String instanceId;
	
	public List<Screen> getScreen() {
		return screen;
	}
	public void setScreen(List<Screen> screen) {
		this.screen = screen;
	}
	
	public String getInstanceId() {
		return instanceId;
	}
	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}
	public String getParentInstanceId() {
		return parentInstanceId;
	}
	public void setParentInstanceId(String parentInstanceId) {
		this.parentInstanceId = parentInstanceId;
	}
	@Override
	public String toString() {
		return "MainJson [screen=" + screen + ", parentInstanceId=" + parentInstanceId + ", instanceId=" + instanceId
				+ "]";
	}
	
	
	
	
	
	
	
	
	
}
