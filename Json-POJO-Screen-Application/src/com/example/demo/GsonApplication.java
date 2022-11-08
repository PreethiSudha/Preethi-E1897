package com.example.demo;

import java.io.FileReader;
import java.io.Reader;

import com.google.gson.Gson;

public class GsonApplication {

	public static void main(String[] args) throws Exception  {
	
		//step -3 json mapping to pojo
		Gson gson = new Gson();
		try {
			Reader reader = new FileReader("Data/file.json");
			MainJson json = gson.fromJson(reader,MainJson.class);
			
			//step - 4 json convertion
			String value = gson.toJson(json);
			System.out.println("Json Format : " +value);
			
			System.out.println(new Gson().toJson(json.getScreen()));
			
			System.out.println(new Gson().toJson(json.getScreen().get(0).getEntitySubTypeId()));
			
		}catch(Exception ex) {
			System.out.println("Exception thrown as : " +ex);
		}
		
		
//		MainJson json = gson.fromJson(result,MainJson.class);
//		System.out.println(new Gson().toJson(json.getScreen()));
		
	}
}
