package com.exmaple.LiskovSubstitution;

import java.util.List;

public class LiskovSubstitutionPrinciple {
	   /**
	    * In case, we try to establish ISA relationship between Square and Rectangle such that we call "Square is a Rectangle", 
	    * below code would start behaving unexpectedly if an instance of Square is passed
	    * Assertion error will be thrown in case of check for area and check for breadth, although the program will terminate as
	    * the assertion error is thrown due to failure of Area check.
	    *   
	    * @param r Instance of Rectangle
	    */
	    public void calculateArea(Rectangle r) {
	        r.setBreadth(2);
	        r.setLength(3);
	        //
	        // Assert Area
	        // 
	        // From the code, the expected behavior is that 
	        // the area of the rectangle is equal to 6
	        //
	        assert r.getArea() == 6 : printError("area", r);
	        //
	        // Assert Length & Breadth
	        //
	        // From the code, the expected behavior is that 
	        // the length should always be equal to 3 and
	        // the breadth should always be equal to 2
	        //
	        assert r.getLength() == 3 : printError("length", r);
	        assert r.getBreadth() == 2 : printError("breadth", r);
	    }
	    private String printError(String errorIdentifer, Rectangle r) {
	        return "Unexpected value of " + errorIdentifer + "  for instance of " + r.getClass().getName();
	    }
	    public static void main(String[] args) {
	    	LiskovSubstitutionPrinciple lsp = new LiskovSubstitutionPrinciple();
	        //
	        // An instance of Rectangle is passed
	        //
	        lsp.calculateArea(new Rectangle());
	        //
	        // An instance of Square is passed
	        //
	        lsp.calculateArea(new Square());
	    }
}

/*
* Square class; Square inherits from Rectangle; 
* Represents ISA relationship - Rectangle is base class
* @author Sourabh Sethi
*/
class Rectangle {
    private int length;
    private int breadth;
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getBreadth() {
        return breadth;
    }
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
    public int getArea() {
        return this.length * this.breadth;
    }
}

/*
* Square class; Square inherits from Rectangle; 
* Represents ISA relationship - Square is a Rectangle
* @author Sourabh Sethi
*/
class Square extends Rectangle {
   @Override
   public void setBreadth(int breadth) {
       super.setBreadth(breadth);
       super.setLength(breadth);
   }
   @Override
   public void setLength(int length) {
       super.setLength(length);
       super.setBreadth(length);
   }
}