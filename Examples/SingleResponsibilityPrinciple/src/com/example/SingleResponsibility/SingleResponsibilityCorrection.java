package com.example.SingleResponsibility;

import java.util.ArrayList;
import java.util.List;

public class SingleResponsibilityCorrection {

	  private ErrorLogger errorLogger = new ErrorLogger();

	    void CreatePost(List<String> db, String postMessage)
	    {
	        try
	        {
	        	 db.add(postMessage);
	        }
	        catch (Exception ex)
	        {
	            errorLogger.log( db,ex.toString());
	        }
	    }
	    
	    public static void main(String []args){
	        System.out.println("Hello World");
	        SingleResponsibilityViolation srv = new SingleResponsibilityViolation();
	        List<String> arrlist =new ArrayList<String>();
	        srv.createPost(arrlist,"String");
	     }
	}

	class ErrorLogger
	{
	    void log(List<String> db, String ex)
	    {
	    	db.add("An error occured: Log error in DB " + ex.toString()); // Log error in DB.
            db.add("An error occured: Log error in File " + ex.toString()); // Log error in File.
        }
	}
	
