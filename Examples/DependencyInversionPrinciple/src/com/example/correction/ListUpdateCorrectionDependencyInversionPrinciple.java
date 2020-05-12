package com.example.correction;

import java.util.ArrayList;
import java.util.List;


public class ListUpdateCorrectionDependencyInversionPrinciple {

	private ListAdd addlist;
	private  ListDelete deleteList;
	public ListUpdateCorrectionDependencyInversionPrinciple(){

	}

	public ListUpdateCorrectionDependencyInversionPrinciple(ListAdd addlist,
			ListDelete deleteList){
		this.addlist = addlist;
		this.deleteList = deleteList;


	}

	void LetsMakeACall() {
		List<Integer> arrlist = new ArrayList<Integer>();
		arrlist.add(1);
		addlist.add(arrlist,1);
		addlist.add(arrlist,2);
		deleteList.delete(arrlist,1);
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