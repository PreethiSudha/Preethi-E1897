package com.example.demo;

public class Obj {
	
	public String id;
    private String input;
    private String functionName;
    private String url;
    private String inputtype;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getInput() {
		return input;
	}
	public void setInput(String input) {
		this.input = input;
	}
	public String getFunctionName() {
		return functionName;
	}
	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getInputtype() {
		return inputtype;
	}
	public void setInputtype(String inputtype) {
		this.inputtype = inputtype;
	}
	@Override
	public String toString() {
		return "Obj [id=" + id + ", input=" + input + ", functionName=" + functionName + ", url=" + url
				+ ", inputtype=" + inputtype + "]";
	}

}
