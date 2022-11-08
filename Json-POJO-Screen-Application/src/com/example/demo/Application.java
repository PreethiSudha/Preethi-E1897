package com.example.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import org.json.JSONException;

import com.google.gson.Gson;

//STEP 3 - POJO CONVERTION
public class Application {

	public static void main(String[] args) throws JSONException {

		// MAIN JSON
		MainJson mjs = new MainJson();

		// SCREEN
		Screen scr = new Screen();

		// LIST<SCREEN>
		List<Screen> scrList = new ArrayList<>();
		scrList.add(scr);
		mjs.setScreen(scrList);
		/*-----------------------------------------------------*/
		// LIST<MAPPING LIST>
		List<MappingList> mpl = new ArrayList<>();
		// LIST<MAPPING ASSOCIATION LIST>
		List<MappingAssociationList> mapl = new ArrayList<>();
		// GROUP PARAM LIST
		GroupParamList gp = new GroupParamList();
		// LIST<GROUP PARAM LIST>
		List<GroupParamList> gpl = new ArrayList<>();
		gpl.add(gp);
		// LIST<SCREENLIST>
		List<ScreenList> scrl = new ArrayList<>();
		// LIST<PARAMETER LIST>
		List<ParameterList> pal = new ArrayList<>();
		
		// STEP 4 - JAVA CLASS TO JSON CONVERTION BY USING GSON
		Gson gson = new Gson();		
		String jss = gson.toJson(mjs);
		System.out.println(gson.toJson(gpl));
		System.out.println("MainJson in json format : ");
		System.out.println(jss);

	}

}
