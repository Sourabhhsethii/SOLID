package com.example.SingleResponsibility;

import java.util.ArrayList;
import java.util.List;

public class SingleResponsibilityViolation {
	
	 void createPost(List<String> db, String postMessage)
	    {
	        try
	        {
	            db.add(postMessage);
	        }
	        catch (Exception ex)
	        {
	            db.add("An error occured: Log error in DB " + ex.toString()); // Log error in DB.
	            db.add("An error occured: Log error in File " + ex.toString()); // Log error in File.
	        }
	        

	        System.out.println(db.get(0));
	    }
	 
	 public static void main(String []args){
	        System.out.println("Hello World");
	        SingleResponsibilityViolation srv = new SingleResponsibilityViolation();
	        List<String> arrlist =new ArrayList<String>();
	        srv.createPost(arrlist,"String");
	     }

}
