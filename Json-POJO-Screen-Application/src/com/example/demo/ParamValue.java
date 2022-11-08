package com.example.demo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ParamValue {
	
	private String default_value;
	private String name;
	private List<DependParameter> dependParameter;
    private List<ParameterCondition> parameterCondition;
    @JsonProperty("TimeFormat") 
    private String timeFormat;
    private List<DefaultValue> defaultValues;
   
	public String getDefault_value() {
		return default_value;
	}
	public void setDefault_value(String default_value) {
		this.default_value = default_value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<DependParameter> getDependParameter() {
		return dependParameter;
	}
	public void setDependParameter(List<DependParameter> dependParameter) {
		this.dependParameter = dependParameter;
	}
	public List<ParameterCondition> getParameterCondition() {
		return parameterCondition;
	}
	public void setParameterCondition(List<ParameterCondition> parameterCondition) {
		this.parameterCondition = parameterCondition;
	}
	public String getTimeFormat() {
		return timeFormat;
	}
	public void setTimeFormat(String timeFormat) {
		this.timeFormat = timeFormat;
	}
	public List<DefaultValue> getDefaultValues() {
		return defaultValues;
	}
	public void setDefaultValues(List<DefaultValue> defaultValues) {
		this.defaultValues = defaultValues;
	}
	
	 @Override
	public String toString() {
		return "ParamValue [default_value=" + default_value + ", name=" + name + ", dependParameter=" + dependParameter
				+ ", parameterCondition=" + parameterCondition + ", timeFormat=" + timeFormat + ", defaultValues="
				+ defaultValues + "]";
	}
	
}
