package com.citibank.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class CollectionMain {

	public static void main(String[] args) {
		System.out.println("Main Starts");
		System.out.println("1. ArrayList");
		List<String> nameList = new ArrayList<>(); 
		
//		System.out.println(nameList.size());
		System.out.println("Name List Size ::" + nameList.size());
		System.out.println("Name List ::" + nameList);
// Adding in the array/list
		nameList.add("Paritosh");
		nameList.add("Abhishek");
		nameList.add("Sandeep");
		nameList.add("Sandeep");
		
		System.out.println("Name List Size ::" + nameList.size());
		System.out.println("Name List ::" + nameList);
		
		System.out.println("Name at index 2 ::" + nameList.get(2));
//		nameList.remove(2); //Removing from the array/list
		nameList.remove("Sandeep"); //Removing from the array/list
		System.out.println("After Remove");
		System.out.println("Name List Size ::" + nameList.size());
		System.out.println("Name List ::" + nameList);
		
		System.out.println("-------------------------------------------------------");
		System.out.println("2. HashSet");
		Set<Integer> numberSet = new HashSet<>(); //Integer is wrapper class of int
		System.out.println("numberSet Size ::" + numberSet.size());
		System.out.println("numberSet ::" + numberSet);
		
		numberSet.add(101);
		numberSet.add(10);
		numberSet.add(11);
		numberSet.add(101);
		numberSet.add(176);
		numberSet.add(11);
		
		System.out.println("After Adding");
		System.out.println("numberSet Size ::" + numberSet.size());
		System.out.println("numberSet ::" + numberSet);
		
		numberSet.remove(101);
		System.out.println("After Removing");
		System.out.println("numberSet Size ::" + numberSet.size());
		System.out.println("numberSet ::" + numberSet);
		
		
		System.out.println("-------------------------------------------------------");
		System.out.println("3. TreeSet");
		SortedSet<String> nameTreeSet = new TreeSet<>();
		System.out.println("nameTreeSet size ::" + nameTreeSet.size());
		System.out.println("nameTreeSet ::" + nameTreeSet);
		
		nameTreeSet.add("B");
		nameTreeSet.add("A");
		nameTreeSet.add("9");
		nameTreeSet.add("C");
		nameTreeSet.add("e");
		nameTreeSet.add("Z");
		nameTreeSet.add("z");
		nameTreeSet.add("U");
		nameTreeSet.add("B");
		nameTreeSet.add("1");
		nameTreeSet.add("d");
		nameTreeSet.add("a");
		nameTreeSet.add(" ");
		
//		nameTreeSet.add(null); // adding null will throw null pointer exception
		
		System.out.println("After adding");
		System.out.println("nameTreeSet size ::" + nameTreeSet.size());
		System.out.println("nameTreeSet ::" + nameTreeSet);
		
		nameTreeSet.remove("Z");
		
		System.out.println("After removing");
		System.out.println("nameTreeSet size ::" + nameTreeSet.size());
		System.out.println("nameTreeSet ::" + nameTreeSet);
				
		System.out.println("Main Ends");

	}

}
