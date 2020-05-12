package com.example.voilation;
import java.util.*;

public class ListUpdateViolationDependencyInversionPrinciple {
	static ListAdd listAdd = new ListAdd();
	static ListDelete listDelete = new ListDelete();
	
	public static void main(String []args){
        System.out.println("Hello World");
        
        List<Integer> arrlist = new ArrayList<Integer>();
        listAdd.add(arrlist,1);
        listAdd.add(arrlist,2);
        listDelete.delete(arrlist,1);
     }

}

class ListAdd {
	
	void add(List<Integer> list , int number ) {
		list.add(number);
		System.out.println("add to list" + list.toString());
		
	}

}

class ListDelete {
	
	void delete(List<Integer> list , int number ) {
		for(int i = 0; i < list.size(); i++) {
			if (list.get(i) == number) {
				list.remove(i);
			}
		}
		System.out.println("delete " + number + " from list" + list.toString());
	}

}