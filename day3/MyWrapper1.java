package day3;

public class MyWrapper1 {
	 String str;
	    String result = "";
	}

	    
	 

	class NotifyWait extends Thread {
	    public void run() {
	        synchronized (Day3Assignment4ReverseString.mw) {
	            try {
	                char ch;
	                for (int i = 0; i < Day3Assignment4ReverseString.mw.str.length(); i++) {
	                    ch = Day3Assignment4ReverseString.mw.str.charAt(i);
	                    Day3Assignment4ReverseString.mw.result = ch + Day3Assignment4ReverseString.mw.result;
	                }
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	            Day3Assignment4ReverseString.mw.notify();
	        }
	    }
	}


