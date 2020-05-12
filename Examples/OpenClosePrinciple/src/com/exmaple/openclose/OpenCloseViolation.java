package com.exmaple.openclose;

import java.util.ArrayList;
import java.util.List;

public class OpenCloseViolation {
	
	void CreatePost(List<String> db, String postMessage)
    {
        if (postMessage.startsWith("#"))
        {
            db.add(postMessage);
        }
        else
        {
            db.add(postMessage);
        }
        
        System.out.println(db.toString());
    }
	
	 public static void main(String []args){
	        System.out.println("Hello World");
	        OpenCloseViolation ocv = new OpenCloseViolation();
	        List<String> arrlist =new ArrayList<String>();
	        ocv.CreatePost(arrlist,"#String");
	     }
}

/* OutPut 
Hello World
[#String] */
