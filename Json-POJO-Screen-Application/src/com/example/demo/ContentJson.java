package com.example.demo;

public class ContentJson {
	
	private String contentType;
	private String contentURL;
	private String contentFileType;
	
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public String getContentURL() {
		return contentURL;
	}
	public void setContentURL(String contentURL) {
		this.contentURL = contentURL;
	}
	public String getContentFileType() {
		return contentFileType;
	}
	public void setContentFileType(String contentFileType) {
		this.contentFileType = contentFileType;
	}
	
	@Override
	public String toString() {
		return "ContentJson [contentType=" + contentType + ", contentURL=" + contentURL + ", contentFileType="
				+ contentFileType + "]";
	}
	
	

}
