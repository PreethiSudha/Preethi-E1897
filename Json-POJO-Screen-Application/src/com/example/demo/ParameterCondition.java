package com.example.demo;

public class ParameterCondition {
	
	private String param_id;
	private String conditionType;
	private String ref_id;
	private String param_name;
	
	public String getParam_id() {
		return param_id;
	}
	public void setParam_id(String param_id) {
		this.param_id = param_id;
	}
	public String getConditionType() {
		return conditionType;
	}
	public void setConditionType(String conditionType) {
		this.conditionType = conditionType;
	}
	public String getRef_id() {
		return ref_id;
	}
	public void setRef_id(String ref_id) {
		this.ref_id = ref_id;
	}
	public String getParam_name() {
		return param_name;
	}
	public void setParam_name(String param_name) {
		this.param_name = param_name;
	}
	@Override
	public String toString() {
		return "ParameterCondition [param_id=" + param_id + ", conditionType=" + conditionType + ", ref_id=" + ref_id
				+ ", param_name=" + param_name + "]";
	}
	
	
	

}
