package com.example.demo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

public class DataApplication {
	
		public static void main(String[] args) throws Exception  {
		
		ObjectMapper mapper = new ObjectMapper();
		
		//step -3 json mapping to pojo
			MainJson mj = mapper.readValue(new File("Data/file.json"), MainJson.class);
			System.out.println("Java Pojo = : "  +mj);
			
			List<ParameterList> pml = new ArrayList<ParameterList>();
//			ParameterList pmObj = new ParameterList();
//			pml.add(pmObj);
//			mj.getScreen().get(0).getGroupParamList().get(0).getParameterList().add(pmObj);
			mj.getScreen().get(0).getGroupParamList().get(0).setParameterList(pml);
			//System.out.println(pml);
			
			//step - 4 json convertion
			Gson gson = new Gson();
			System.out.println("Json = : " +gson.toJson(mj));
			
			System.out.println("ParameterList Object : " +mj);
			System.out.println(mj.getScreen().get(0).getEntityId());
			
			//System.out.println(mj.getScreen().get(0).getGroupParamList().set(0, pml));
			
			System.out.println("Specified Object : " );
			System.out.println("Screen class : " +gson.toJson(mj.getScreen()));
	
//			System.out.println("Entity ID : " +gson.toJson(mj.getScreen().get(0).getEntityId()));
//			
//			System.out.println("GroupParamList class :" +gson.toJson(mj.getScreen().get(0).getGroupParamList()));
			System.out.println("--Button Selection---" +gson.toJson(mj.getScreen().get(0).getGroupParamList().get(0).getGroupParamList().get(0).getChannelType()));
	}

}
