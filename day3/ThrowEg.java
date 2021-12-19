package day3;

import java.io.FileNotFoundException;

public class ThrowEg {

	

	    public void ThrowEg() {
	        System.out.println("Inside method");
	        throw new  NullPointerException();
	    }

	    ThrowEg(){
	        System.out.println("Inside constructor");
	        throw new ArithmeticException();
	    }

	 
	    public static void main(String[] args) {

	        try {
	            throw new FileNotFoundException();
	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();        
	        }finally {
	            try {
	            throw new NumberFormatException();}catch (Exception e) {
	                // TODO: handle exception
	            }
	        }


	        ThrowEg t=new ThrowEg();
	        t.ThrowEg();

	    }
	}


