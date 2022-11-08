package com.example.demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LoopApplication {

	public static void main1(String[] args) {
//
//		List<GroupParamList1> gplt5 = new ArrayList<>();
//
//		int size = gplt5.size();
//		System.out.println("size : " + size);
//		int count = ++size;
//		System.out.println("count : " + count);
//		for (int i = 0; i <= count; i++) {
//			GroupParamList1 gpo = new GroupParamList1();
//			gpo.setButtonSelection("FW");
//			gplt5.add(gpo);
//			 ListIterator<GroupParamList1> itr = gplt5.listIterator(); 
//			 while(itr.hasNext()) { 
//				 GroupParamList1 obj = itr.next(); 
//				 obj = new GroupParamList1();
//				 System.out.println(obj);
//				 } 
//			 for (GroupParamList1 gpli :gplt5) { 
//				 System.out.println(gpli); 
//				 }
//		}
//
//		gplt5.forEach(System.out::println);
	}
	
	public static void main(String[] args) {
			List<GroupParamList1> gplt5 = new ArrayList<>();
			int size = gplt5.size();
			System.out.println("size : " + size);
			int count = ++size;
			System.out.println("count : " + count);
			int i=0;

			do {
				GroupParamList1 gpo = new GroupParamList1();
				gpo.setButtonSelection("FW");
				gplt5.add(gpo);
				i++;
				System.out.println(gplt5);
			}while(i >= count);
			
	}
		
		
		
		// System.out.println("------------*****************-----------");
		// System.out.println(gplt5);
		// System.out.println(new Gson().toJson(gplt5));

	public static void main3(String[] args) {
//		List<GroupParamList1> gplit = new ArrayList<>();
//		GroupParamList1 gpo = new GroupParamList1();
//		
//		ListIterator<GroupParamList1> itr = gplit.listIterator();
//		while (itr.hasNext()) {
//			GroupParamList1 obj = itr.next();
//			obj = new GroupParamList1();
//			gplit.add(obj);
//			gplit.add(gpo);
//		}
//		for (GroupParamList1 gpli : gplit) {
//			System.out.println(gpli);
//		}
//
	}

}