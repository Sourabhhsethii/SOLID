package com.exmaple.openclose;

import java.util.ArrayList;
import java.util.List;

public class OpenCloseCorrection {
	void CreatePost(List<String> db, String postMessage)
    {
        db.add(postMessage);
        System.out.println("OpenCloseCorrection" + db.toString());
    }
	
	public static void main(String []args){
        System.out.println("Hello World");
        
        LetsExtendOpenClose leoc = new LetsExtendOpenClose();
        List<String> arrlist =new ArrayList<String>();
        leoc.CreatePost(arrlist,"String LetsExtendOpenClose");
        
        OpenCloseCorrection occ = new OpenCloseCorrection();
        occ.CreatePost(arrlist,"String OpenCloseCorrection");
     }
}

class LetsExtendOpenClose extends OpenCloseCorrection
{
    void  CreatePost(List<String> db, String postMessage)
    {
        db.add(postMessage);
        System.out.println( "LetsExtendOpenClose " + db.toString());
    }
    
    
}